//package tn.esprit.rh.achat.services;
//
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.core.annotation.Order;
//import tn.esprit.rh.achat.entities.Operateur;
//import tn.esprit.rh.achat.repositories.OperateurRepository;
//import tn.esprit.rh.achat.services.IOperateurService;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@SpringBootTest
//public class OperateurServiceTest {
//
//	@Autowired
//	IOperateurService operateurService;
//
//	@Autowired
//	OperateurRepository operateurRepository;
//
//	@Test
//	@Order(0)
//	public void testAddOperateur() {
//
//		List<Operateur> ops = operateurService.retrieveAllOperateurs();
//		int expected=ops.size();
//		Operateur o = new Operateur((long)12,"ouss","kh","3000",null);
//
//	    Operateur savedOp= operateurService.addOperateur(o);
//
//		assertEquals(expected+1, operateurService.retrieveAllOperateurs().size());
//		assertNotNull(o.getIdOperateur());
//
////		operateurService.deleteOperateur(o.getIdOperateur());
//		}
//
//
//
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
