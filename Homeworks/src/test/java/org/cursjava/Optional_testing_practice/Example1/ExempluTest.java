package org.cursjava.Optional_testing_practice.Example1;

import org.cursjava.EXTRA_EXERCITII.Optional_testing_practice.Example1.Exemplu;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExempluTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Usually is used to MAKE the connection to Data base");
    }

    //1. Cream un obiect de test (in setUp() il initializam) din metoda pt care vrem sa facem testul!
    private Exemplu testObject;
    private Exemplu testObject1;


    @BeforeEach
    void setUp() {
        System.out.println("setUp");
        //2. Initalizam obiectul de test;
        testObject = new Exemplu();
        testObject1 = new Exemplu();

    }


    @Test
    public void test_sumAB_withSuccess(){
        System.out.println("metodaTest");
        //4. Cream o variablia si ii dam avloare obiectului de test (care vrem sa fie rezultatul)
        int result = testObject.sumAB(2,3);
        //5. Verificam daca metoda este corecta, cu assertEqual, assertTrue....etc...assertEquals->verifica egalitatea a doua obiecte
        //expected->trec ceea ce ma astept sa fie ca resultat, output
        //result-> rezultatul
        //deci in mare, verific daca expected e la fel cu rezult
        assertEquals(5, result);
    }


    @Test
    public void test_evenNumber_success(){
        System.out.println("check even number with success");
        boolean result = testObject.evenNumber(8);
        assertEquals(true, result);
    }

    @Test
    public void test_evenNumber_fail(){
        System.out.println("check even number with success");
        boolean result = testObject.evenNumber(9);
        assertEquals(false, result);
    }


    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
        //3. Resetez obiectul \(null);
        testObject = null;
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Usually is used to CLOSE the connection to Data base");
    }
}