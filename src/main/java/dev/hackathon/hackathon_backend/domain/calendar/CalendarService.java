package dev.hackathon.hackathon_backend.domain.calendar;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {

    // Returns a List<Calendar> of all the events in the olympic calendar
    public List<Calendar> findAll(){
        return List.of(
                new Calendar("100M","Stade de France","", "11H30-13H","15H-17H", "", "Séries", "Demi-Finales + Finale"),
                new Calendar("200M","Stade de France","10H-11H30", "15H-16H","17H-17H30", "Séries", "Demi-Finales", "Finale"),
                new Calendar("Saut en Hauteur","Aréna Porte de la Chapelle","12H-14H", "17H-18H","", "Qualifications", "Finale", ""),
                new Calendar("Lancer du Poids","Aréna Porte de la Chapelle","14H-17H", "","", "Qualifications + Finale", "", ""),
                new Calendar("50M Nage Libre","Paris la Défense Aréna","17H-19H", "13H-14H","", "Séries", "Demi-finales + Finale", ""),
                new Calendar("200M Nage Libre","Paris la Défense Aréna","", "","9H30-12H", "", "", "Séries + Demi-Finales + Finale")
        );
    }
}
