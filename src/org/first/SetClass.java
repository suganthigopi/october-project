package org.first;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SetClass {
	

	

	
		private String name;
		private int id;
		private long mobile;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		public static void main(String[] args) {
			SetClass a =new SetClass();
			a.setName("sugu");
			a.setId(20);
			a.setMobile(5236987412l);
			
			SetClass a1 =new SetClass();
			a1.setName("gopi");
			a1.setId(10);
			a1.setMobile(9843705212l);
			
			
			Map<String,SetClass>m=new LinkedHashMap<>();
			m.put("manager", a);
			m.put("client", a1);
			Set<Entry<String, SetClass>> entrySet = m.entrySet();
			for (Entry<String, SetClass> y : entrySet) {
				System.out.println(y.getKey());
				System.out.println(y.getValue().getName());
				System.out.println(y.getValue().getId());
				System.out.println(y.getValue().getMobile());
				
			}
		}
		
		

	}




