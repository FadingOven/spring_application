<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.


C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
- UI customized to show "Halsten Golf" as the shop name, as well as the table names changed to "individual clubs" and "full sets"
- Lines Changed: 14, 19, 20, 22, 58



D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
- About page added to the application along with mapping to and from mainscreen.html.
- Link to navigate to about page added on mainscreen.html line 20
- Link back to homepage added on about.html line 14


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
- Added sample inventory of parts and products to the application. 
-  Sample inventory located on lines 48 - 115 of BootStrapData.java



F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

-Buy Now button added next to the update and delete product buttons. Located on mainscreen.html line 91 
-Buy Now button successfully decrements product inventory by 1 upon successful purchase. Located on BuyProductController.java lines 24 - 41


G.  Modify the parts to track maximum and minimum inventory by doing the following:
- Added additional fields to the part entity for maximum and minimum inventory. Located on Part.java lines 31-34, 50-51, 86-90
- Modified sample inventory to include the maximum and minimum fields. Located on BootStrapData.java lines 48-99
- Added correlating inventory fields to InhousePartForm and OutsourcedPartForm forms for the inventory. Located on InhousePartForm.html lines 24 - 29 and OutSourcedPartForm.html lines 25 - 29
- Renamed the file for persistent storage. Located on application.properties line 6
- Modified code to enforce part inventory is between minimum and maximum values Located on PartInventoryValidator.java lines 22 - 33


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
- Added two unit tests to PartTest Class for maximum and minimum fields Located on PartTest.java lines 160 - 192

J.  Remove the class files for any unused validators in order to clean your code.
-Removed ValidDeletePart and DeletePartValidator as they were unused