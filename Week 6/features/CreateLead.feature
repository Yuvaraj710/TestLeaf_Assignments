Feature: Create Lead Functinality in LeafTap


Scenario Outline: TC001_Creating Lead in LeafTap Application

Given Click Leads link 
And Click on create lead 
And Enter company name as <cname>  
And Enter first name as <fname>  
And Enter last name as <lname>
When Click on Create Lead button
Then Lead should be created  

Examples:
|cname|fname|lname|
|"Km Group"|"Kemal"|"Soydere"|