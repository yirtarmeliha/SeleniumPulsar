package Scenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class ElementsJS {

    public static WebDriver driver;
    public static JavascriptExecutor js;

    public ElementsJS(WebDriver webDriver) {
        driver = webDriver;
        js = (JavascriptExecutor) driver;

    }

    public static void FruitAndVegMenuKG(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('KG')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }



    //.VegMenu
    public static void pointVegMenu(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('.Veg')\").parent().click()\n\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuSPINACH(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('SPINACH')\").parent().click()\n\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }



    public static void pointVegMenuARTICHOKE() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('ARTICHOKE')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuCAPSLONGRED() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('CAPS LONG RED')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }



    public static void pointVegMenuASPARAGUS() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('ASPARAGUS')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointVegMenuBASIL() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BASIL')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointVegMenuBeansRed() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Beans Red')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuBROCCOLIROMANESCO() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BROCCOLI ROMANESCO')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuBEANSBOBBY() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BEANS BOBBY')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }


    public static void pointVegMenuBeansBroad1kg() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Beans Broad 1kg')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }



    public static void pointVegMenuAUBERGINETURKISH() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('AUBERGINE TURKISH')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointVegMenuBROCCOLI() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BROCCOLI')\").filter(function(){ return $(this).text() == 'BROCCOLI'; }).parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointVegMenuButternut() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Butternut')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }




    public static void pointVegMenuTOMATOBOX() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('TOMATO BOX')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }










    //.FruitMenu
    public static void pointFruitMenu(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('.Fruit')\").parent().click()\n\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuALMONDFRESH1kg() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('ALMOND FRESH 1kg')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuBLACKBERRY() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BLACKBERRY')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuCOCONUT() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('COCONUT')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }



    public static void pointFruitMenuAVOCADO() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('AVOCADO')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuBanana1kg() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('BANANA 1kg')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuORANGESMALL() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('ORANGE SMALL')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuWATERMELON() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('WATERMELON  ')\").filter(function(){ return $(this).text() == 'WATERMELON  '; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuAPPLECHINESE() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('APPLE CHINESE')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuCherrySour() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Cherry Sour')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuPLUMPRESIDENT() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('PLUM PRESIDENT')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuStrawberry250gr() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Strawberry 250gr')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuLimePack() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript("$(\"span:contains('Lime Pack')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuLEMON() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('LEMON')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuLemonSweet() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Lemon Sweet')\").filter(function(){ return $(this).text() == 'Lemon Sweet'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }





    public static void pointFruitMenuAPPLEGREEN1kg() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('APPLE GREEN 1kg')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuClementineBox2kg() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Clementine Box 2kg')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }








//SAYFA DEĞİŞİM FRUİT MENU

    public static void pointFruitMenuABC() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'ABC\\')\").filter(function(){ return $(this).text() == 'ABC'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuCDEFG() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'CDEFG\\')\").filter(function(){ return $(this).text() == 'CDEFG'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuHKLM() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'HKLM\\')\").filter(function(){ return $(this).text() == 'HKLM'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void pointFruitMenuMNOP() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'MNOP\\')\").filter(function(){ return $(this).text() == 'MNOP'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuPQRSTW() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'PQRSTW\\')\").filter(function(){ return $(this).text() == 'PQRSTW'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void pointFruitMenuWY() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"button:contains(\\'WY\\')\").filter(function(){ return $(this).text() == 'WY'; }).trigger(\"click\");");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }



//ana ekran butonlar

    public static void SoftDrink_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Soft')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void a_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('a')\").filter(function(){ return $(this).text() == 'a'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void b_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('b')\").filter(function(){ return $(this).text() == 'b'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void c_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('c')\").filter(function(){ return $(this).text() == 'c'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void d_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('d')\").filter(function(){ return $(this).text() == 'd'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void f_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('f')\").filter(function(){ return $(this).text() == 'f'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void g_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('g')\").filter(function(){ return $(this).text() == 'g'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void i_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('i')\").filter(function(){ return $(this).text() == 'i'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void q_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('q')\").filter(function(){ return $(this).text() == 'q'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void j_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('j')\").filter(function(){ return $(this).text() == 'j'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }



    public static void k_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('k')\").filter(function(){ return $(this).text() == 'k'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void l_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('l')\").filter(function(){ return $(this).text() == 'l'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }




    public static void u_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('u')\").filter(function(){ return $(this).text() == 'u'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void x_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('x')\").filter(function(){ return $(this).text() == 'x'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void n_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('n')\").filter(function(){ return $(this).text() == 'n'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void e_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('e')\").filter(function(){ return $(this).text() == 'e'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void r_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('r')\").filter(function(){ return $(this).text() == 'r'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void o_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('o')\").filter(function(){ return $(this).text() == 'o'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void s_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('s')\").filter(function(){ return $(this).text() == 's'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void t_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('t')\").filter(function(){ return $(this).text() == 't'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void v_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('v')\").filter(function(){ return $(this).text() == 'v'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void w_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('w')\").filter(function(){ return $(this).text() == 'w'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }






    public static void cigaretteOrTobacco_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Cigarette')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void grocery_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Grocery')\").filter(function(){ return $(this).text() == 'Grocery'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void groceryNokta_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Grocery...')\").filter(function(){ return $(this).text() == 'Grocery...'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void Butchery_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Butchery')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void abcd_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('abcd')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void bag_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Bag')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void nuts_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Nuts')\").parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


    public static void houseHold_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('House')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }




    public static void FruitVeg_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Fruit&Veg')\").filter(function(){ return $(this).text() == 'Fruit&Veg'; }).parent().click()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }



    public static void ManualWeight_MainMonitor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        js.executeScript(" $(\"span:contains('Manual')\").parent().click()\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }












}
