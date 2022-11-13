
//package tn.esprit.rh.achat;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.core.annotation.Order;
//import tn.esprit.rh.achat.entities.Produit;
//import tn.esprit.rh.achat.repositories.ProduitRepository;
//import tn.esprit.rh.achat.services.IProduitService;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@SpringBootTest
//public class ServiceProduitTest {
//    @Autowired
//    IProduitService produitService;
//
//    @Autowired
//    ProduitRepository produitRepository;
//
//    @Test
//    @Order(0)
//    public void testAddProduit() {
//
//        List<Produit> ops = produitService.retrieveAllProduits();
//        int expected=ops.size();
//       Produit p = new Produit((long)12,"123","sa",100,null,null,null,null,null);
//
//        Produit savedp= produitService.addProduit(p);
//
//        assertEquals(expected+1, produitService.retrieveAllProduits().size());
//        assertNotNull(savedp.getIdProduit());
//       // produitService.deleteProduit(savedp.getIdProduit());
//    }



