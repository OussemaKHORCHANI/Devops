pipeline {
          agent any
            tools{
            maven 'M2_HOME'

        }

        environment {
         DOCKERHUB_CREDENTIALS=credentials('walid')
        }


        stages {
//
//         stage('Cloning from Git') {
//             steps {
//             git branch:'Produit-Management',url:'https://github.com/OussemaKHORCHANI/Devops.git'
//           }
//         }
//
//
//         stage('clean') {
//           steps {
//            sh "mvn -B -DskipTests clean  "
//           }
//         }
//
//
//
//         stage('Artifact Construction') {
//           steps{
//            sh "mvn -B -DskipTests package "
//           }
//         }
//
//         stage('Unit Tests et mokito') {
//           steps{
//            sh "mvn test "
//           }
//
//         }
//
//
//         stage('Sonarqube') {
//           steps {
//            sh "mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=123456789"
//           }
//         }
//
//         stage ("Deployement"){
//           steps{
//            sh 'mvn clean package -Dmaven.test.skip=true deploy:deploy-file -DgroupId=tn.esprit.rh -DartifactId=achat -Dversion=1.0 -DgeneratePom=true -Dpackaging=jar -DrepositoryId=deploymentRepo -Durl=http://192.168.1.19:8081/repository/maven-releases/ -Dfile=target/achat-1.0.jar'
//            }
//         }
//
//
//         stage('Building Docker Image'){
//          steps {
//              sh 'docker build -t walid0519/achat:4.0 .'
//           }
//         }
//         stage('Pushing Docker image') {
//             steps {
//                 sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR -p $DOCKERHUB_CREDENTIALS_PSW'
//                 sh 'docker push walid0519/achat:4.0'
//            }
//         }
        stage('Run Docker-compose') {
            steps {
                sh "docker-compose up -d"
         }
        }


        }
        post {
        always {
        mail to: 'walid.saada@esprit.tn',
        subject: "Status of pipeline: ${currentBuild.fullDisplayName}",
        body: "${env.BUILD_URL} has result ${currentBuild.result}"
        }
        }
        }
