Feature: Edit Lead Functinality in LeafTap

Scenario Outline: TC002_Editing a Lead in LeafTap Application

Given Click Leads link 
And Click on Find lead 
And Click on Phone Tab in Find By  
And Enter Phone Number as <phno> 
And Click on Find Leads 
And Click on First Lead from Leads List
And Click on Edit Button
And Update company name as <cname>
When Click on submit button 
Then Lead is Updated Successfully
 
Examples:
|phno|cname|
|'99'|'TCS'|