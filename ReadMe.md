# Direction to Run 

- Take the jar file from build folder (generated through gradle jar) which is 
> HotelAssessment\build\libs
- Run following command , with replaced input value as shown below. 
```
java -jar HotelAssessment-1.0.jar "REGULAR,19 MAY 2021(THU),20 MAY 2021(FRI),21 MAY 2021(SAT),22 MAY 2021(SUN), 23 MAY 2021(MON)"
```
---
## Assumptions 
- Booking done for all the days will be in one hotel only. 

## Considerations 
- Currency is always '$' , localization has not been implemented.
- Amounts in real world are in double , here for simplicity its taken as int.
- Currently Have only included few parameterized unit test cases, essentially ignored private method which can be done using 3rd party libraries.
- **Probability** have been ignored in calculation (which would have made program more direct, with additional if statement branching)
	-	e.g. Regular Customer, possibility of weekend,weekend best can be precalculated 
			and same thing can be taken care with switch cases, rather then checking for each usecases. 
	
- Branching has been done for Customer Type and using 'if' as they were direct, would have considered using dynamic dispatch once there are more complexity gets added to Requirement, so as to keep code modular.  

---
### Debugging (Temporary Check)
- Rather than using logger , have left line 26, in HotelService which has a print statement (Currently commented).
