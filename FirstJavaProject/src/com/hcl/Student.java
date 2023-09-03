package com.hcl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;  
@NoArgsConstructor  
@AllArgsConstructor  
@ToString  
public class Student  
{  
private @Getter @Setter Integer sttudentId;  
private @Getter @Setter String studentName;  
private @Getter @Setter String studentClass;  
private @Getter @Setter String studentEmailId;  
}  