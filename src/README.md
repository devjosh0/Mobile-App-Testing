
## MOBILE TEST AUTOMATION
Java quickstart project for test automation, covering performance and security testing. Created with lessons learned from a large number of development projects to provide all commonly required components and concepts.

## Concepts Included
- Page Object pattern
- Mavenised performance tests
- Dependency injection
- Commonly used test utility classes

## Prerequisites
- Java JDK 
- https://www.oracle.com/eg/java/technologies/downloads/
- Java IDE eg Eclipse or Intellij  
- https://www.jetbrains.com/idea/download/#section=windows
- Appium Server 
- https://appium.io/
- Android Mobile Emulator using Android Studio   
- https://developer.android.com/studio?gclid=CjwKCAiAr4GgBhBFEiwAgwORrUk-LpDlZVEvAwr70nDnPWDyuYkFlTNa-quheBkk5RzlMBJG88gI2xoCIUwQAvD_BwE&gclsrc=aw.ds
- or 
- Apple Simulator using xcode 
- https://apps.apple.com/us/app/xcode/id497799835?mt=12

## Getting Started
- Open or launch IDE
- Clone the project using the link below in your IDE Terminal.
https://github.com/devjosh0/Mobile-App-Testing.git

## Inside the src/main/java file, we have four(4) packages.
- First package is named CapabilitiesPageObject, which contains a class of desired capabilities.
- Second package is named Implementation, which contains a class of functions having its of the element locators.
- Third package is named Locators, which contains a class of all the id's, xpath, accessibility id's locators of all the elements.
- Fourth package is named PageBase, which contains a class of all the actions functions we will use throughout the test eg click, scroll, sendText, getText and clear functions etc.

## Inside the src/Test/java file, we have two(2) packages.
- First package is named addcarttestpage, which contains a class that will excute or run add products to cart from our imported ImplementationPageObject.
- Second package is named signuptestpage, which contains a class that will excute or run signup action from our imported ImplementationPageObject.



