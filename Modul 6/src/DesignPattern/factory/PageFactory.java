package DesignPattern.factory;

import DesignPattern.pages.Page;

public interface PageFactory {
    Page create(String type);
}
