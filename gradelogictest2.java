if (Grade < 0 || Grade > 101)
			System.out.println("The Entered Grade is out of the vaild range");

		else if (Grade >= 87)
			System.out.println("A");

		else if (Grade >= 80 && Grade < 86)
			System.out.println("B");

		else if (Grade >= 70 && Grade < 79)
			System.out.println("C");

		else if (Grade < 60 && Grade < 69)
			System.out.println("D");

		else if (Grade < 50)
			System.out.println("F");
