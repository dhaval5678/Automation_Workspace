package com153;

public class ban {
	
	
		void ban()
		{
			System.out.println("banking");
		}
	}

	class Current extends Ban
	{
		void current()
		{
			System.out.println("current");
		}

		public void ban() {
			// TODO Auto-generated method stub
			
		}
	}
	class Save extends Ban
	{
		void save()
		{
			System.out.println("saving");
			
		}
	}

	public class HierarchicalEx 
	{
		public static void main(String[] args) 
		{
			
			Current c =new Current();
			Save s =new Save();
			
			c.current();
			s.save();
			c.ban();
			
		}
	}


