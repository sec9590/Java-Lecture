package practice06_190410.ex03;

import java.time.LocalDate;
import java.util.*;

public class CompanyExample {

	public static void main(String[] args) {
		TreeSet<Company> treeset = new TreeSet<Company>();
		treeset.add(new Company(11, "이유덕", Position.부장, LocalDate.parse("1992-05-21")));
		treeset.add(new Company(21, "이재영", Position.부장, LocalDate.parse("1993-03-20")));
		treeset.add(new Company(35, "권정표", Position.차장, LocalDate.parse("1996-07-11")));
		treeset.add(new Company(42, "박민호", Position.과장, LocalDate.parse("1995-06-21")));
		treeset.add(new Company(55, "강상희", Position.대리, LocalDate.parse("1999-05-21")));
		treeset.add(new Company(62, "김지완", Position.사원, LocalDate.parse("2002-03-21")));
		treeset.add(new Company(75, "송정환", Position.과장, LocalDate.parse("1994-05-02")));
		treeset.add(new Company(81, "이성연", Position.차장, LocalDate.parse("1997-10-01")));
		treeset.add(new Company(91, "전경헌", Position.대리, LocalDate.parse("2001-01-21")));
		treeset.add(new Company(10, "김재성", Position.사원, LocalDate.parse("2003-11-05")));
		
				
		for(Company company : treeset)
			System.out.println(company.toString());
		

	}

}
