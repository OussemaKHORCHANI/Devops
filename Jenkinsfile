
pipeline {
	agent any
	tools{
	 maven 'M2_HOME'

	}
	environment {
        DOCKERHUB_CREDENTIALS=credentials('DockerHubAccount')
    }

    stages {

        stage('Cloning from Git') {
            steps {
                echo 'Cloning...'
                git branch:'Operateur-Management',url:'https://github.com/OussemaKHORCHANI/Devops.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
               sh 'mvn clean package  -DskipTests=true'
               archiveArtifacts "target/achat-1.0.jar"
            }
        }


		stage ("Launching unit tests"){
			steps{
			    echo 'Testing..'
				sh "mvn test"
			}
// 			post{
// 			    always{
// 			         junit '**/target/surefire-reports/TEST-*.xml'
// 			    }
			}


        stage('Sonarqube') {
            steps {
                sh "mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=123456"
            }
        }

        stage ("Deployement"){
			steps{
			    echo 'Deploying to Nexus'
				sh 'mvn clean package -Dmaven.test.skip=true deploy:deploy-file -DgroupId=tn.esprit.rh -DartifactId=achat -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://192.168.0.5:8081/repository/maven-releases/ -Dfile=target/achat-1.0.jar'
			}
		}

// 		stage('Building Docker Image'){
// 			  steps {
//                      sh 'docker build -t ousskh63/achat .'
//               }
// 		}

// 		stage('Pushing Docker image') {
//             steps {
//                 sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR -p $DOCKERHUB_CREDENTIALS_PSW'
//                 sh 'docker push ousskh63/achat'
//                 }
// 		}
		stage('Run Docker-compose') {
                steps {
                  	sh "docker-compose up -d"
            	}
        }


   }
     post {
       always {
          mail to: 'ousskh63@gmail.com',
             subject: "Status of pipeline: ${currentBuild.fullDisplayName}",
             body: "${env.BUILD_URL} has result ${currentBuild.result}"
       }
     }
}



