//package tn.esprit.rh.achat.services;
//
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import tn.esprit.rh.achat.entities.Operateur;
//import tn.esprit.rh.achat.repositories.OperateurRepository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//@Slf4j
//@ExtendWith(MockitoExtension.class)
//public class OperateurServiceMockTest {
//
//
//    @InjectMocks
//    OperateurServiceImpl operateurService;
//
//    @Mock
//    OperateurRepository operateurRepository;
//    Operateur o1 = Operateur.builder().nom("mock1").prenom("mockitou").password("passmock").factures(null).build();
//
//    @Test
//    public void saveOperateurTest() {
//
//        operateurService.addOperateur(o1);
//        verify(operateurRepository, times(1)).save(o1);
//        log.info(String.valueOf(o1));
//        log.info("operateur added ");
//    }
//
//    @Test
//    public void getAllSecteursTest()
//    {
//        List<Operateur> operateurList = new ArrayList<Operateur>() {
//
//            {
//                add(o1);
//                add(Operateur.builder().nom("mock158").prenom("mockitoooooooooo").password("passmock").factures(null).build());
//                add(Operateur.builder().nom("mock16").prenom("mockitou").password("passmock").factures(null).build());
//            }};
//
//
//        when(operateurService.retrieveAllOperateurs()).thenReturn(operateurList);
//        //test
//        List<Operateur> sList = operateurService.retrieveAllOperateurs();
//        assertEquals(3, sList.size());
//        log.info(" Retrieve all is working correctly...!!");
//
//    }
//}
