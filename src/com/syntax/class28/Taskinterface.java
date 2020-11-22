package com.syntax.class28;

public class Taskinterface {
    /*
   Create a WebDriver Interface that will have the following unimplemented behaviour:
   openBrowser(), closeBrowser(), maximizeWindow(), maximizeWindow()
   Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    */
    interface WebDriver {
        void openBrowser();
        void closeBrowser();
        void maximizeWindow();
    }
    static class ChromDriver implements WebDriver{
        @Override
        public void openBrowser() {
            System.out.println("Open Chrome Browser");
        }
        @Override
        public void closeBrowser() {
            System.out.println("Close Chrome Browser");
        }
        @Override
        public void maximizeWindow() {
            System.out.println("Maximize Window in the Browser");
        }
        static class FireFoxDriver implements WebDriver {
            @Override
            public void openBrowser() {
                System.out.println("Open FireFox  Browser");
            }
            @Override
            public void closeBrowser() {
                System.out.println("Close FireFox Browser");
            }
            @Override
            public void maximizeWindow() {
                System.out.println("Maximize Window in the FireFox Browser");
            }
            static class TestInterface {
                public static void main(String[] args) {
                    WebDriver test = new ChromDriver();
                    test.openBrowser();
                    test.maximizeWindow();
                    test.closeBrowser();
                    WebDriver test1 = new FireFoxDriver();
                    test1.openBrowser();
                    test1.maximizeWindow();
                    test1.closeBrowser();
                }
            }
        }}
}
