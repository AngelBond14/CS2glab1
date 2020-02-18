if (temp < -5 || temp > 110)
			System.out.println("The Entered Temprture is out of the vaild range");

		else if (temp >= 90)
			System.out.println("Aprox Summer Temp");

		else if (temp >= 70 && temp < 90)
			System.out.println("Aprox Spring Temp");

		else if (temp >= 50 && temp < 70)
			System.out.println("Aprox Autumn Temp");

		else if (temp < 50)
			System.out.println("Aprox Winter Temp");
