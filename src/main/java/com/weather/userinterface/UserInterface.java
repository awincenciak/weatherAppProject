package com.weather.userinterface;

import com.weather.entry.EntryController;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;


public class UserInterface {


    public static void main(String[] args) {


            System.out.println("Aplikacja jest uruchomiona\n");

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Witaj w serwisie pogodowym. Co chcesz zrobić?");
                System.out.println("1. Dodać lokalizację do bazy");
                System.out.println("2. Wyświetlić wszystkie dodane lokalizacje");
                System.out.println("3. Pobrac dane o pogodzie");
                System.out.println("0. Zamknąć aplikacje");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        //createEntry();
                        break;
                    case 2:
                        //getAllEntries();
                        break;
                    case 3:
                        //getWeatherData();
                        break;
                    case 0:
                        return;
                }
                System.out.println();
            }
        }

        private void getAllEntries() {

        }

        private void createEntry() {
            }
    }



