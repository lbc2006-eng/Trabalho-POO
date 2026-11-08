package executavel;

import entidades.*;
import java.util.Scanner;

public class Programa {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		Pessoa dono1 = new Pessoa ("Leo");
		Pessoa dono2 = new Pessoa ("Lucas");
		Pessoa dono3 = new Pessoa ("Gabriel");
		Pessoa dono4 = new Pessoa ("Pedro");
		Pessoa dono5 = new Pessoa ("Joao");
		Pessoa dono6 = new Pessoa ("Vitor");
		Pessoa dono7 = new Pessoa ("Tiago");
		
		Veiculo carro1 = new Carro ("Peugeot 208", 50_000.0, 1_000.0, dono1, new IpvaPorPreco());
		Veiculo carro2 = new Carro ("Citroen C3", 60_000.0, 1_200.0, dono2, new IpvaPorPeso());
		Veiculo carro3 = new Carro ("Renault Kwid", 80_000.0, 1_000.0, dono3, new IpvaPorPreco());
		Veiculo carro4 = new Carro ("Renault Logan", 100_000.0, 1_400.0, dono4, new IpvaPorPeso());
		Veiculo carro5 = new Carro ("Fiat Argo", 65_000.0, 1_100.0, dono5, new IpvaPorPreco());
		Veiculo carro6 = new Carro ("Chevrolet Onix", 75_000.0, 1_150.0, dono6, new IpvaPorPeso());
		Veiculo carro7 = new Carro ("Hyundai HB20", 72_000.0, 1_120.0, dono7, new IpvaPorPreco());
		
		Veiculo moto1 = new Moto ("Yamaha Fazer", 40_000.0, 150.0, dono1, new IpvaPorPeso());
		Veiculo moto2 = new Moto ("Kawasaki Ninja", 90_000.0, 180.0, dono2, new IpvaPorPreco());
		Veiculo moto3 = new Moto ("Yamaha R1", 50_000.0, 170.0, dono3, new IpvaPorPeso());
		Veiculo moto4 = new Moto ("Honda CB 500", 45_000.0, 160.0, dono4, new IpvaPorPreco());
		Veiculo moto5 = new Moto ("BMW G 310 R", 35_000.0, 158.0, dono5, new IpvaPorPeso());
		Veiculo moto6 = new Moto ("Suzuki GSX-S750", 55_000.0, 190.0, dono6, new IpvaPorPreco());
		Veiculo moto7 = new Moto ("Ducati Monster", 80_000.0, 185.0, dono7, new IpvaPorPeso());

		sc.close();
	}
}
