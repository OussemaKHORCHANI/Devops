package tn.esprit.rh.achat;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.repositories.ProduitRepository;
import tn.esprit.rh.achat.services.ProduitServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class ProduitServiceMockTest {


    @InjectMocks
    ProduitServiceImpl produitService;

    @Mock
    ProduitRepository produitRepository;
    Produit P1 = Produit.builder().codeProduit("mock1").libelleProduit("mockitou").prix(123).categorieProduit(null).dateCreation(null).detailFacture(null).stock(null).categorieProduit(null).build();

    @Test
    public void saveProduitTest() {
        produitService.addProduit(P1);
        verify(produitRepository, times(1)).save(P1);
        log.info(String.valueOf(P1));
        log.info("produit added ");
    }

    @Test
    public void getAllSecteursTest()
    {
        List<Produit> produitList = new ArrayList<Produit>() {

            {
                add(P1);
                add(Produit.builder().codeProduit("mock12").libelleProduit("mockitou2").prix(1234).categorieProduit(null).dateCreation(null).detailFacture(null).stock(null).categorieProduit(null).build());
                add(Produit.builder().codeProduit("mock123").libelleProduit("mockitou23").prix(12345).categorieProduit(null).dateCreation(null).detailFacture(null).stock(null).categorieProduit(null).build());
            }};


        when(produitService.retrieveAllProduits()).thenReturn(produitList);
        //test
        List<Produit> sList = produitService.retrieveAllProduits();
        assertEquals(3, sList.size());
        log.info(" Retrieve all is working correctly...!!");

    }
}
