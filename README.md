N11 Overseas Product Inspection Automation Project
Project Overview
This project provides an automated test suite specifically designed to inspect product details and visuals within the "Overseas Products" category on the N11 e-commerce website. It automates navigation to this category, scrolling through product listings, clicking on a product to view its details, and then iterating through product images to ensure their display. The project also includes assertions for specific product evaluations and the presence of overseas product indicators. Developed using Java, Selenium WebDriver, and TestNG, it adheres to the Page Object Model (POM) for structured and maintainable test code.

Project Goal
The main objectives of this project are to:

Automate navigation to the "Overseas Products" category on N11.

Simulate user interaction by scrolling down the product listing page.

Navigate to the details page of a selected overseas product.

Inspect and verify the display of all product images on the detail page by iterating through them.

Assert the presence and correctness of product evaluation details (e.g., total evaluations).

Verify that overseas product indicators (e.g., a specific image/badge) are displayed correctly.

Showcase proficiency in Java, Selenium WebDriver, and TestNG for e-commerce test automation, with a specific focus on international product listings.

Technologies Used
Programming Language: Java

Test Automation Framework: Selenium WebDriver

Testing Framework: TestNG

Logging: java.util.logging.Logger (or org.apache.logging.log4j.LogManager if Log4j is used)

Design Pattern: Page Object Model (POM)

Utility: java.awt.Robot (for keyboard/mouse actions, if used for scrolling/interactions)

Setup and Run Instructions
To set up and run this project locally, follow these steps:

Clone the Repository:

git clone https://github.com/BoraSari/N11InspectingProductTestAutomationProject.git
cd N11InspectingProductTestAutomationProject

(Note: Replace BoraSari with your actual GitHub username if different. Adjust the repository name if it's different in your actual GitHub setup.)

Prerequisites:

Ensure Java Development Kit (JDK) 8 or higher is installed.

Have Maven (or Gradle) installed and configured for dependency management.

Download the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver) for your browser and ensure it's accessible by your test environment (e.g., via WebDriverManager or system PATH).

Ensure BaseTest class correctly initializes the WebDriver.

If using Log4j, configure it (e.g., log4j2.xml or log4j2.properties in src/main/resources or src/test/resources) for logging output.

Build the Project:

mvn clean install

(If using Gradle, replace mvn commands with gradle commands.)

Run the Tests:
Tests are configured with TestNG priorities. You can run them via a TestNG XML suite or directly from your IDE (e.g., IntelliJ IDEA, Eclipse).

Example testng.xml:

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="N11 Overseas Product Inspection Test Suite">
    <test name="Overseas Product Inspection Tests">
        <classes>
            <class name="N11Tests.N11Tests"/> <!-- Replace with your actual test class name if different -->
        </classes>
    </test>
</suite>

Run with Maven:

mvn test -DsuiteXmlFile=testng.xml

Or run directly from your IDE.

Test Coverage and Scenarios
This project covers the following key scenarios for N11's overseas product inspection:

N11NavigateOverseasProductCategoryTest (Priority 1):

Description: Verifies the successful navigation to the "Overseas Products" category on the N11 website.

Flow: Navigates to the N11 main page and then proceeds to the overseas products category.

navigateOverseasProductTest (Priority 2):

Description: Automates scrolling down the overseas product page and clicking on a specific product to view its details.

Flow: Scrolls down the overseas product page to load more content, then clicks on a product image/link.

checkingOverseasProductTest (Priority 3):

Description: Inspects the product details page for an overseas product, including iterating through product images and verifying evaluation details and the presence of overseas product indicators.

Flow: Clicks on the product (again, to ensure the details page is active for image inspection), iterates through product pictures by clicking an arrow button multiple times, closes the image section, and asserts that the product's evaluation text (e.g., "55\ndeğerlendirme") and an overseas image are displayed. Includes error handling for assertions.

Screenshots/GIFs
(Lütfen buraya test yürütmesini, "Yurt Dışı Ürünler" kategorisi sayfasını, ürün detay sayfasındaki görsel geçişlerini ve varsa "yurt dışı ürün" göstergesini gösteren ekran görüntüleri veya GIF'ler ekleyerek projenin işlevselliğini görsel olarak sergileyin.)

License
This project is licensed under the MIT License - see the LICENSE file for details.

N11 Yurt Dışı Ürün İnceleme Otomasyon Projesi
Projeye Genel Bakış
Bu proje, N11 e-ticaret web sitesindeki "Yurt Dışı Ürünler" kategorisindeki ürün detaylarını ve görsellerini incelemek için özel olarak tasarlanmış otomatik bir test paketi sunar. Bu kategoriye navigasyonu, ürün listelemeleri arasında kaydırmayı, bir ürüne tıklayarak detaylarını görüntülemeyi ve ardından ürün görselleri arasında gezinerek bunların görüntülendiğini doğrulamayı otomatize eder. Proje ayrıca belirli ürün değerlendirmeleri ve yurt dışı ürün göstergelerinin varlığı için doğrulamalar da içerir. Java, Selenium WebDriver ve TestNG kullanılarak geliştirilen bu proje, yapılandırılmış ve bakımı kolay test kodu için Page Object Model (POM) prensiplerine uyar.

Proje Amacı
Bu projenin temel hedefleri şunlardır:

N11'deki "Yurt Dışı Ürünler" kategorisine navigasyonu otomatikleştirmek.

Ürün listeleme sayfasında aşağı kaydırarak kullanıcı etkileşimini simüle etmek.

Seçilen bir yurt dışı ürünün detay sayfasına gitmek.

Detay sayfasındaki tüm ürün görsellerini gezerek ve doğrulayarak incelemek.

Ürün değerlendirme detaylarının (örn: toplam değerlendirme sayısı) varlığını ve doğruluğunu kontrol etmek.

Yurt dışı ürün göstergelerinin (örn: özel bir görsel/rozet) doğru görüntülendiğini doğrulamak.

Uluslararası ürün listelemelerine özel odaklanarak e-ticaret test otomasyonu için Java, Selenium WebDriver ve TestNG'deki yetkinliği sergilemek.

Kullanılan Teknolojiler
Programlama Dili: Java

Test Otomasyon Çerçevesi: Selenium WebDriver

Test Çerçevesi: TestNG

Günlük Kaydı: java.util.logging.Logger (veya Log4j kullanılıyorsa org.apache.logging.log4j.LogManager)

Tasarım Deseni: Page Object Model (POM)

Yardımcı Araç: java.awt.Robot (kaydırma/etkileşimler için kullanılıyorsa)

Kurulum ve Çalıştırma Talimatları
Bu projeyi yerel olarak kurmak ve çalıştırmak için aşağıdaki adımları izleyin:

Depoyu Klonlayın:

git clone https://github.com/BoraSari/N11InspectingProductTestAutomationProject.git
cd N11InspectingProductTestAutomationProject

(Not: BoraSari yerine gerçek GitHub kullanıcı adınızı yazın. GitHub'daki gerçek kurulumunuz farklıysa depo adını ayarlayın.)

Ön Koşullar:

Java Development Kit (JDK) 8 veya daha yüksek bir sürümün yüklü olduğundan emin olun.

Maven (veya Gradle) yüklü ve bağımlılık yönetimi için yapılandırılmış olmalıdır.

Tarayıcınız için uygun WebDriver'ı (örn: ChromeDriver, GeckoDriver) indirin ve test ortamınız tarafından erişilebilir olduğundan emin olun (örn: WebDriverManager veya sistem PATH aracılığıyla).

BaseTest sınıfının WebDriver'ı doğru bir şekilde başlattığından emin olun.

Log4j kullanıyorsanız, günlük kaydı çıktısı için yapılandırın (örn: src/main/resources veya src/test/resources içinde log4j2.xml veya log4j2.properties).

Projeyi Derleyin:

mvn clean install

(Gradle kullanıyorsanız, mvn komutlarını gradle komutlarıyla değiştirin.)

Testleri Çalıştırın:
Testler TestNG öncelikleriyle yapılandırılmıştır. Testleri bir TestNG XML paketi aracılığıyla veya doğrudan IDE'nizden (örn: IntelliJ IDEA, Eclipse) çalıştırabilirsiniz.

Örnek testng.xml:

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="N11 Yurt Dışı Ürün İnceleme Test Paketi">
    <test name="Yurt Dışı Ürün İnceleme Testleri">
        <classes>
            <class name="N11Tests.N11Tests"/> <!-- Gerçek test sınıfı adınız farklıysa lütfen değiştirin -->
        </classes>
    </test>
</suite>

Maven ile çalıştırma:

mvn test -DsuiteXmlFile=testng.xml

Veya doğrudan IDE'nizden çalıştırın.

Test Kapsamı ve Senaryoları
Bu proje, N11'in yurt dışı ürün incelemesi için aşağıdaki temel senaryoları kapsar:

N11NavigateOverseasProductCategoryTest (Öncelik 1):

Açıklama: N11 web sitesindeki "Yurt Dışı Ürünler" kategorisine başarılı navigasyonu doğrular.

Akış: N11 ana sayfasına gider ve ardından yurt dışı ürünler kategorisine ilerler.

navigateOverseasProductTest (Öncelik 2):

Açıklama: Yurt dışı ürün sayfasını aşağı kaydırmayı ve detaylarını görüntülemek için belirli bir ürüne tıklamayı otomatize eder.

Akış: Yurt dışı ürün sayfasını daha fazla içerik yüklemek için aşağı kaydırır, ardından bir ürün görseline/bağlantısına tıklar.

checkingOverseasProductTest (Öncelik 3):

Açıklama: Bir yurt dışı ürünün detay sayfasını inceler, ürün görselleri arasında gezinir ve değerlendirme detayları ile yurt dışı ürün göstergelerinin varlığını doğrular.

Akış: Ürüne tıklar (görsel inceleme için detay sayfasının etkin olduğundan emin olmak için tekrar), bir ok düğmesine birden çok kez tıklayarak ürün resimleri arasında gezinir, resim bölümünü kapatır ve ürünün değerlendirme metninin (örn: "55\ndeğerlendirme") ve bir yurt dışı görselinin görüntülendiğini doğrular. Doğrulamalar için hata yönetimi içerir.

Ekran Görüntüleri/GIF'ler
![image](https://github.com/user-attachments/assets/25ce39df-fd65-4bb4-b9bd-55349d1f19d9)

License
This project is licensed under the MIT License - see the LICENSE file for details.
