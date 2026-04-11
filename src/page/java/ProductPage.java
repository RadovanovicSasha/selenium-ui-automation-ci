import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {


    // LOKATORI:

// 1) klik na tab "šok akcija":
    // <a href="https://www.militaryshop.rs/kategorija-proizvoda/sok-akcija/" class="nav-top-link">Šok akcija</a>

    private final By sokAkcijaTab = By.cssSelector("a.nav-top-link[href*='kategorija-proizvoda/Šok-akcija']");

// 2) Klik na proizvod:
    // <a href="https://www.militaryshop.rs/shop/odeca/naocare/suncane-naocare-kingseven/elegantne-suncane-naocare-kingseven-n7906-orange/">
    //	<img width="100" height="100" src="https://www.militaryshop.rs/wp-content/uploads/2023/05/orange-3-100x100.jpg" class="attachment-woocommerce_gallery_thumbnail size-woocommerce_gallery_thumbnail" alt="Elegantne Sunčane Naočare - Kingseven N7906 Orange" decoding="async" srcset="https://www.militaryshop.rs/wp-content/uploads/2023/05/orange-3-100x100.jpg.webp 100w, https://www.militaryshop.rs/wp-content/uploads/2023/05/orange-3-340x340.jpg.webp 340w" sizes="(max-width: 100px) 100vw, 100px">		<span class="product-title">Elegantne Sunčane Naočare - Kingseven N7906 Orange</span>
    //	</a>

    private final By elegantneNaocare = By.cssSelector("a[href*='www.militaryshop.rs/shop/odeca/naocare/suncane-naocare-kingseven/elegantne-suncane-naocare-kingseven-n7906-orange']");
                            // Unable to locate element: {"method":"css selector","selector":"a[href*='elegantne-suncane-naocare-kingseven-n7906-orange']"}
// 3) Dodaj u korpu:
    // <button type="submit" name="add-to-cart" value="670643" class="single_add_to_cart_button button alt">Dodaj u korpu</button>

    private final By dodajKorpa = By.cssSelector("button[name='add-to-cart']");


    // -------------------------------------------------------------------------

    // PROSLEĐUJEMO DRIVER (ka BasePage) - POM KONSTRUKTOR
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // METODE:

//    public void korakPrviAkcija() {
//        driver.findElement(sokAkcijaTab).click();
//    }
//
//    public void korakDrugiAkcija() {
//        driver.findElement(elegantneNaocare).click();
//    }
//
//    public void korakTreciKorpa() {
//        driver.findElement(dodajKorpa).click();
//    }

    public void tokOdabiraProizvoda() {
        driver.findElement(sokAkcijaTab).click();
        driver.findElement(elegantneNaocare).click();
        driver.findElement(dodajKorpa).click();
    }
}
