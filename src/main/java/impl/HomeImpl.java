package impl;

import pages.HomePage;

public class HomeImpl {
    HomePage homePageElements;

    public HomePage getHomePageElements(){
        if (homePageElements == null){
            homePageElements = new HomePage();
        }

        return homePageElements;
    }
}
