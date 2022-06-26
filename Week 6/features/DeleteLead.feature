Feature: Leaftaps Delete Lead functionality 

Scenario Outline: TC003 Delete Lead to application - Positive 

Given Click on the Leads link 
And Click on the Find leads 
And Click on the Phone 
And Enter the phone number <phone> 
And Click on the find leads button 
And Capture lead ID of First Resulting lead and Click First Resulting lead 
And Click Delete 
And Click on the Find leads 
And Enter captured lead ID 
When Click on the find leads button 
Then Verify message 'No records to display' in the Lead List 
	
Examples: 
|phone|
|'99'|