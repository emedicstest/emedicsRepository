package com.wael.micro2media;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import android.app.ActionBar.LayoutParams;
import android.app.DialogFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.wael.micro2media.R.id;
import com.wael.micro2media.R.layout;

public class FragmentConsultation extends Fragment {
    private ListView listView ;
    private Calendar cal;
	private int day;
	private int month;
	private int year;
    View rootView;
    private ArrayAdapter<String> dataAdapterSpinnerQuestion2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestion3a;
    private ArrayAdapter<String> dataAdapterSpinnerQuestion3b;
    private ArrayAdapter<String> dataAdapterSpinnerQuestion3c;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionB1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionB2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionB3;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionB4;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionB5;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionC1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionC2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionC3;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionD1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionE1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionE2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionF1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionF2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionF3AndF4;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionG1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionG2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionH1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionH2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionH3;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionH4;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionH5a;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionH5b;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionH6aAndb;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionI1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionI2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionI3;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionJ1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionK1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionK2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionK3;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionK4a;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionK4b;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionK4c;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionK5;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionK6;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionK7;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionK8;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionL2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionL3;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionL4;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionL5;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionL6;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionM1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionM2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionM3;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionM4;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionN1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionO1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionO2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionP2a;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionP2b;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionP3;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionP4;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionP5;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionP6;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionP7;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionQ1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionQ2;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionQ3;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionR1;
    private ArrayAdapter<String> dataAdapterSpinnerQuestionR2;
    
    
    private TextView TextViewQuestionBS3;
    private TextView TextViewQuestionB3a;
    private Spinner spinnerQuestionB3a ;
    private TextView TextViewQuestionB3b;
    private Spinner spinnerQuestionB3b;
    private TextView TextViewQuestionB3c;
    private Spinner spinnerQuestionB3c;
    private TextView  TextViewQuestionB4;
    private Spinner spinnerQuestionB4;
    private TextView  TextViewQuestionB5;
    private Spinner spinnerQuestionB5;
    private TextView  TextViewQuestionG2;
    private TextView TextViewQuestionG2a;
    private Spinner spinnerQuestionG2a;
    private TextView TextViewQuestionG2b;
    private Spinner spinnerQuestionG2b;
    private TextView TextViewQuestionG3;
    private TableLayout table;  
    private TextView TextViewQuestionJ1a;
    private EditText edittextSectionJ1a1;
    private EditText edittextSectionJ1a2;
    private EditText edittextSectionJ1a3;
    private TextView  TextViewQuestionMS2;
    private TextView  TextViewQuestionM2;
    private Spinner  spinnerQuestionM2;
    private TextView TextViewQuestionM3;
    private TextView  TextViewQuestionM3a;
    private Spinner  spinnerQuestionM3a;
    private TextView  TextViewQuestionM3b;
    private Spinner spinnerQuestionM3b;
    private TextView  TextViewQuestionM3c;
    private Spinner  spinnerQuestionM3c;
    private TextView  TextViewQuestionM3d;
	private Spinner  spinnerQuestionM3d;
	
	private  TextView TextViewQuestionPS2;
	private  TextView TextViewQuestionP2a;
	private  Spinner spinnerQuestionP2a;
	private  TextView TextViewQuestionP2b;
	private Spinner  spinnerQuestionP2b;

	private  TextView TextViewQuestionP3;
	private  Spinner spinnerQuestionP3;
	private  TextView TextViewQuestionP4;
	private  Spinner spinnerQuestionP4;
	private  TextView TextViewQuestionP5;
	private  TextView TextViewQuestionP5a;
	private  Spinner spinnerQuestionP5a;
	private  TextView TextViewQuestionP5b;
	private  Spinner spinnerQuestionP5b;
	private  TextView TextViewQuestionP5c;
	private  Spinner spinnerQuestionP5c;
	private  TextView TextViewQuestionP5d;
	private  Spinner spinnerQuestionP5d;
	private  TextView TextViewQuestionP5e;
	private  Spinner spinnerQuestionP5e;
	private  TextView TextViewQuestionP6;
	private Spinner spinnerQuestionP6;
	private  TextView TextViewQuestionP7;
	private Spinner spinnerQuestionP7;
    FragmentConsultation() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		rootView = inflater.inflate(layout.fragment_patients, container,
				false);
		  // Get ListView object from xml
        listView = (ListView) rootView.findViewById(id.myListView);

        cal = Calendar.getInstance();
		day = cal.get(Calendar.DAY_OF_MONTH);
		month = cal.get(Calendar.MONTH);
		year = cal.get(Calendar.YEAR);
        // Defined Array values to show in ListView
        String[] values = new String[] { "A. DATE D’EVALUATION", 
                                         "B. ETAT COGNITIF",
                                         "C. COMMUNICATION / AUDITION ",
                                         "D. VISION", 
                                         "E. HUMEUR ET COMPORTEMENT ", 
                                         "F. FONCTION SOCIALE", 
                                         "G. AIDE DE L’ENTOURAGE ", 
                                         "H. ETAT PHYSIQUE ET FONCTIONNEL " ,
                                         "I. CONTINENCE dans les 3 derniers jours ",
                                         "J. DIAGNOSTICS MEDICAUX ",
                                         "K. PROBLEMES DE SANTE",
                                         "L. ETAT NUTRITIONNEL, HYDRATATION",
                                         "M. PROBLEMES DE LA PEAU ET DES PIEDS ",
                                         "N. EVALUATION DE L’ENVIRONNEMENT PHYSIQUE ",
                                         "O. UTILISATION DE SERVICES PROFESSIONNELS ",
                                         "P. MEDICAMENTS",
                                         "Q. EVALUATION D’ENSEMBLE",
                                         "R. RESPONSABILITES, DIRECTIVES ",
                                         "S: INFORMATIONS SUR EVALUATION "
                                       
                                        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),
android.R.layout.simple_list_item_1, android.R.id.text1, values);
        
        
        List<String> listSpinnerQuestion2 = new ArrayList<String>();
        listSpinnerQuestion2.add("première évaluation, à l’admission");
        listSpinnerQuestion2.add("réévaluation (évaluation de suivi)");
        listSpinnerQuestion2.add("changement de l’état de la cliente");
        listSpinnerQuestion2.add("correction");
        listSpinnerQuestion2.add("autre");


        dataAdapterSpinnerQuestion2  = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestion2);
        
        
        
        List<String> listSpinnerQuestion3a = new ArrayList<String>();
        listSpinnerQuestion3a.add("seule");
        listSpinnerQuestion3a.add("avec conjoint");
        listSpinnerQuestion3a.add("avec conjoint et autres (enfants, parents, amis)");
        listSpinnerQuestion3a.add("avec enfants, sans conjoint");
        listSpinnerQuestion3a.add("avec autre membre de sa parenté");
        listSpinnerQuestion3a.add("vit en groupe avec des non-parents");

   
        dataAdapterSpinnerQuestion3a  = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestion3a);
        
        
        List<String> listSpinnerQuestion3b = new ArrayList<String>();
        listSpinnerQuestion3b.add("Domicile privé/appartement/appartement pour personnes âgées (sans précédente intervention du centre d’aide et de soins à domicile)");
        listSpinnerQuestion3b.add("Domicile privé/appartement/appartement pour personnes âgées (avec précédente intervention du centre d’aide et de soins à domicile)");
        listSpinnerQuestion3b.add("logements encadrés avec prestations de service");
        listSpinnerQuestion3b.add("maison de retraite médicalisée");
        listSpinnerQuestion3b.add("autre endroit");
 

        dataAdapterSpinnerQuestion3b  = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestion3b);
        
        List<String> listSpinnerQuestion3c = new ArrayList<String>();
        listSpinnerQuestion3c.add("Non, pas de séjour à l‘hôpital dans les 90 derniers jours");
        listSpinnerQuestion3c.add("Oui, sortie au cours des 31-90 derniers jours");
        listSpinnerQuestion3c.add("Oui, sortie au cours des 8-30 derniers jours");
        listSpinnerQuestion3c.add("Oui, sortie au cours des 7derniers jours");
 
        dataAdapterSpinnerQuestion3c  = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestion3c);
        
        List<String> listSpinnerQuestionB1 = new ArrayList<String>();
        listSpinnerQuestionB1.add("mémoire OK");
        listSpinnerQuestionB1.add("problème de mémoire");
     
        dataAdapterSpinnerQuestionB1  = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionB1);
        
        List<String> listSpinnerQuestionB2 = new ArrayList<String>();
        listSpinnerQuestionB2.add("INDEPENDANTE - décisions logiques, raisonnables et sûres");
        listSpinnerQuestionB2.add("INDEPENDANCE ALTEREE - Quelques difficultés dans situa- tions nouvelles uniquement");
        listSpinnerQuestionB2.add("LEGEREMENT DEFICIENTE - dans situations particulières, déci- sions pauvres ou risquées,  a besoin d’indications ou  de surveillance");
        listSpinnerQuestionB2.add("MOYENNEMENT DEFICIENTE - Décisions presque toujours  pauvres ou risquées ; a besoin d’indications/surveillance  continue");
        listSpinnerQuestionB2.add("GRAVEMENT DEFICIENTE - Ne prend pratiquement jamais de  décisions");

        dataAdapterSpinnerQuestionB2  = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionB2);
        
        List<String> listSpinnerQuestionB3 = new ArrayList<String>();
        listSpinnerQuestionB3.add("comportement pas observé");
        listSpinnerQuestionB3.add("comportement observé, mais n’est pas  nouveau (comportement habituel)");
        listSpinnerQuestionB3.add("comportement observé, mais qui diffère du comportement  habituel (p.ex. comportement nouveau ou détérioration)");
       
        dataAdapterSpinnerQuestionB3  = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionB3);
        
        List<String> listSpinnerQuestionB4 = new ArrayList<String>();
        listSpinnerQuestionB4.add("Oui");
        listSpinnerQuestionB4.add("Non"); 
        
        dataAdapterSpinnerQuestionB4 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionB4);
        
        
        List<String> listSpinnerQuestionB5 = new ArrayList<String>();
        listSpinnerQuestionB5.add("Amélioré");
        listSpinnerQuestionB5.add("Détérioré"); 
        listSpinnerQuestionB5.add("Pas de modification"); 
        listSpinnerQuestionB5.add("Ambigu"); 

        dataAdapterSpinnerQuestionB5 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionB5);
        
        
        List<String> listSpinnerQuestionC1 = new ArrayList<String>();
        listSpinnerQuestionC1.add("EST COMPRISE");
        listSpinnerQuestionC1.add("EST GENERALEMENT COMPRISE – difficultés à trouver ses mots et aller au bout de sa pensée ; mais si on laisse du temps, peu ou pas d’aide requise"); 
        listSpinnerQuestionC1.add("EST SOUVENT COMPRISE– difficulté à trouver les mots et aller au bout de la pensée ; aide en général nécessaire"); 
        listSpinnerQuestionC1.add("EST PARFOIS COMPRISE – capacité limitée à l’expression de demandes concrètes"); 
        listSpinnerQuestionC1.add("RAREMENT OU JAMAIS COMPRISE"); 

        dataAdapterSpinnerQuestionC1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionC1);
        
        List<String> listSpinnerQuestionC2 = new ArrayList<String>();
        listSpinnerQuestionC2.add("COMPREND");
        listSpinnerQuestionC2.add("COMPREND SOUVENT - PAS TOUJOURS TOUTE LA SIGNIFICATION DE L‘INFORMATION"); 
        listSpinnerQuestionC2.add("COMPREND PARFOIS - UNIQUEMENT DES DIRECTIVES ET DES QUESTIONS SIMPLES"); 
        listSpinnerQuestionC2.add("COMPREND RAREMENT OU JAMAIS"); 

        dataAdapterSpinnerQuestionC2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionC2);
        
        
        List<String> listSpinnerQuestionC3 = new ArrayList<String>();
        listSpinnerQuestionC3.add("ENTEND BIEN – (conversation, T.V., téléphone, sonnette)");
        listSpinnerQuestionC3.add("DIFFICULTES MINIMES – dans un environnement bruyant"); 
        listSpinnerQuestionC3.add("N’ENTEND QUE DANS DES SITUATIONS PARTICULIERES. L’interlocuteur doit modifier le ton et articuler"); 
        listSpinnerQuestionC3.add("ATTEINTE GRAVE – n’entend pratiquement rien"); 
        
        dataAdapterSpinnerQuestionC3 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionC3);
        
        List<String> listSpinnerQuestionD1 = new ArrayList<String>();
        listSpinnerQuestionD1.add("BONNE. Distingue les détails, y compris les caractères ordi- naires des journaux/livres");
        listSpinnerQuestionD1.add("LEGEREMENT DEFICIENTE. Ne lit que les gros caractères des journaux/livres"); 
        listSpinnerQuestionD1.add("MOYENNEMENT DEFICIENTE. Vision limitée, ne lit pas les titres des journaux mais reconnaît les objets"); 
        listSpinnerQuestionD1.add("TRES DEFICIENTE. Semble suivre les objets des yeux, mais on ne sait pas si elle les reconnaît");
        listSpinnerQuestionD1.add("GRAVEMENT ATTEINTE. Ne voit rien ou ne distingue que la lumière, les couleurs ou les formes. Ne suit pas les objets des yeux");

        
        dataAdapterSpinnerQuestionD1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionD1);
        
        List<String> listSpinnerQuestionE1 = new ArrayList<String>();
        listSpinnerQuestionE1.add("pas manifestés dans les 3 derniers jours");
        listSpinnerQuestionE1.add("manifestés, mais pas dans les 3 derniers jours"); 
        listSpinnerQuestionE1.add("manifestés dans les 3 derniers jours"); 
        listSpinnerQuestionE1.add("la cliente ne répond pas");

        dataAdapterSpinnerQuestionE1= new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionE1);
        
        
        List<String> listSpinnerQuestionE2 = new ArrayList<String>();
        listSpinnerQuestionE2.add("non manifesté dans les 3 derniers jours ");
        listSpinnerQuestionE2.add("manifesté, mais facilement maîtrisé "); 
        listSpinnerQuestionE2.add(" manifesté et difficilement maîtrisé"); 
        listSpinnerQuestionE2.add("la cliente ne répond pas");

        dataAdapterSpinnerQuestionE2= new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionE2);
        
        
        List<String> listSpinnerQuestionF1 = new ArrayList<String>();
        listSpinnerQuestionF1.add("dans les 7 derniers jours");
        listSpinnerQuestionF1.add("dans le dernier mois "); 
        listSpinnerQuestionF1.add("auparavant ou pas du tout "); 
        listSpinnerQuestionF1.add("la cliente ne répond pas ");

        dataAdapterSpinnerQuestionF1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionF1);
        
        
        List<String> listSpinnerQuestionF2 = new ArrayList<String>();
        listSpinnerQuestionF2.add("pas de diminution des activités sociales");
        listSpinnerQuestionF2.add("diminution, la cliente n’en souffre pas"); 
        listSpinnerQuestionF2.add("diminution, la cliente en souffre"); 
        listSpinnerQuestionF2.add("la cliente ne répond pas");
        listSpinnerQuestionF2.add("GRAVEMENT ATTEINTE. Ne voit rien ou ne distingue que la lumière, les couleurs ou les formes. Ne suit pas les objets des yeux");

        dataAdapterSpinnerQuestionF2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionF2);
        
        List<String> listSpinnerQuestionF3AndF4 = new ArrayList<String>();
        listSpinnerQuestionF3AndF4.add("non");
        listSpinnerQuestionF3AndF4.add("oui"); 
        listSpinnerQuestionF3AndF4.add("la cliente ne répond pas"); 
       
        dataAdapterSpinnerQuestionF3AndF4 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionF3AndF4);
        
        List<String> listSpinnerQuestionG1 = new ArrayList<String>();
        listSpinnerQuestionG1.add("aucun aidant");
        listSpinnerQuestionG1.add("un ou plusieurs aidants"); 
        		
        dataAdapterSpinnerQuestionG1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionG1);
        
        List<String> listSpinnerQuestionG2 = new ArrayList<String>();
        listSpinnerQuestionG2.add("ne s’applique pas");
        listSpinnerQuestionG2.add("s‘applique"); 

        dataAdapterSpinnerQuestionG2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionG2);
        
        
        List<String> listSpinnerQuestionH1 = new ArrayList<String>();
        listSpinnerQuestionH1.add("indépendante, fait seule ");
        listSpinnerQuestionH1.add("surveillance, supervision, directives, encouragement "); 
        listSpinnerQuestionH1.add("dépendance partielle, est parfois aidée");
        listSpinnerQuestionH1.add("dépendance importante, est toujours aidée "); 
        listSpinnerQuestionH1.add("dépendance totale, activité faite par autrui (lors de capacité de performance = dépendance totale) ");
        listSpinnerQuestionH1.add("l’activité n’a pas été accomplie "); 
        
        dataAdapterSpinnerQuestionH1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionH1);
        
        
        List<String> listSpinnerQuestionH2 = new ArrayList<String>();
        listSpinnerQuestionH2.add("indépendante (la cliente fait tout seule) ou préparation seulement");
        listSpinnerQuestionH2.add("surveillance, encouragement ou indications seulement "); 
        listSpinnerQuestionH2.add("dépendance partielle : cliente très participative, reçoit une aide ne nécessitant pas de force ");
        listSpinnerQuestionH2.add("dépendance importante : cliente peu participative, reçoit une  aide nécessitant de la force "); 
        listSpinnerQuestionH2.add("dépendance totale : cliente ne participe pas, activité entiè- rement faite par d’autres durant les 3 derniers jours ");
        listSpinnerQuestionH2.add("l'activité n'a pas été accomplie "); 
        
        dataAdapterSpinnerQuestionH2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionH2); 
        
        
        List<String> listSpinnerQuestionH3 = new ArrayList<String>();
        listSpinnerQuestionH3.add("Amélioré");
        listSpinnerQuestionH3.add("Détérioré"); 
        listSpinnerQuestionH3.add("Pas de modification");
        listSpinnerQuestionH3.add("Ambigu"); 
        
        dataAdapterSpinnerQuestionH3 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionH3);
        
        
        List<String> listSpinnerQuestionH4 = new ArrayList<String>();
        listSpinnerQuestionH4.add("monte et descend sans aide");
        listSpinnerQuestionH4.add("monte et descend avec aide"); 
        listSpinnerQuestionH4.add("n’a pas  monté ni descendu les escaliers");
        
        dataAdapterSpinnerQuestionH4 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionH4);
        
        List<String> listSpinnerQuestionH5a = new ArrayList<String>();
        listSpinnerQuestionH5a.add("2 heures ou plus (en tout)");
        listSpinnerQuestionH5a.add("moins de 2 heures "); 
        
        dataAdapterSpinnerQuestionH5a = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionH5a);
        
        
        List<String> listSpinnerQuestionH5b = new ArrayList<String>();
        listSpinnerQuestionH5b.add("les 3 jours");
        listSpinnerQuestionH5b.add("1 ou 2 jours"); 
        listSpinnerQuestionH5b.add("aucune sortie, mais la cliente sort habituellement de façon régulière");
        listSpinnerQuestionH5b.add("la cliente ne sort jamais de son domicile"); 
        
        dataAdapterSpinnerQuestionH5b = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionH5b);
        
        List<String> listSpinnerQuestionOuiNon = new ArrayList<String>();
        listSpinnerQuestionOuiNon.add("oui");
        listSpinnerQuestionOuiNon.add("non"); 
        
        dataAdapterSpinnerQuestionH6aAndb = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);
        
        
        List<String> listSpinnerQuestionI1 = new ArrayList<String>();
        listSpinnerQuestionI1.add("CONTINENTE, contrôle complet. N’utilise aucun type de sonde ou de moyen pour recueillir les urines. ");
        listSpinnerQuestionI1.add("CONTINENTE AVEC CATHETER OU STOM");  
        listSpinnerQuestionI1.add("HABITUELLEMENT CONTINENTE – n’est pas incontinente chaque jour ");
        listSpinnerQuestionI1.add("INCONTINENTE AVEC RESTE DE CONTROLE –  incontinente  quasi quotidienne ; reste de contrôle possible");  
        listSpinnerQuestionI1.add("INCONTINENTE: contrôle inadéquat, mouillée plusieurs fois par jour ");
        listSpinnerQuestionI1.add("Aucune émission d’urine provenant de la vessie");  
        
        
        dataAdapterSpinnerQuestionI1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionI1);
        
        
        List<String> listSpinnerQuestionI2 = new ArrayList<String>();
        listSpinnerQuestionI2.add("CONTINENT –  contrôle complet sans stomie ");
        listSpinnerQuestionI2.add("CONTINENTE AVEC STOMIE ");  
        listSpinnerQuestionI2.add("HABITUELLEMENT CONTINENTE – – n’est pas incontinente chaque jour ");
        listSpinnerQuestionI2.add("INCONTINENTE AVEC RESTE DE CONTROLE –  incontinente quotidiennement ; reste de contrôle possible ");  
        listSpinnerQuestionI2.add("INCONTINENTE : incontinente quotidiennement ; inconti- nence fécale : à peine encore de contrôle ");
        listSpinnerQuestionI2.add("Aucune émission de selles durant les 3 derniers jours");  
        
        
        dataAdapterSpinnerQuestionI2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionI2);
        
        dataAdapterSpinnerQuestionI3 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);
        
        dataAdapterSpinnerQuestionJ1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);
        
        List<String> listSpinnerQuestionK1 = new ArrayList<String>();
        listSpinnerQuestionK1.add("PAS PRESENT");
        listSpinnerQuestionK1.add("PRESENT, MAIS PAS DANS LES 3 DERNIERS JOURS");  
        listSpinnerQuestionK1.add("PRESENT DANS LES 3 DRNIERS JOURS");

        dataAdapterSpinnerQuestionK1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionK1);
        
        
        List<String> listSpinnerQuestionK2 = new ArrayList<String>();
        listSpinnerQuestionK2.add("PAS PRÉSENTE ");
        listSpinnerQuestionK2.add("PRÉSENTE UNIQUEMENT LORS D’EFFORT MOYEN");  
        listSpinnerQuestionK2.add("PRESENTE LORS D’EFFORTS QUOTIDIENS LEGERS"); 
        listSpinnerQuestionK2.add("PRÉSENTE AU REPOS"); 

        dataAdapterSpinnerQuestionK2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionK2);
        
        List<String> listSpinnerQuestionK3 = new ArrayList<String>();
        listSpinnerQuestionK3.add("NON ");
        listSpinnerQuestionK3.add("LÉGÈRE - BAISSE D’ÉNERGIE; EFFECTUE TOUT DE MÊME SES ACTIVITÉS HABITUELLES ");  
        listSpinnerQuestionK3.add("MOYENNE - N’EST PAS CAPABLE À CAUSE D’UNE PERTE D’ÉNERGIE, D’EFFECTUER SES ACTIVITÉS HABITUELLES JUSQU’AU BOUT"); 
        listSpinnerQuestionK3.add("IMPORTANTE  - EST INCAPABLE  À CAUSE D’UNE PERTE D’ÉNERGIE DE COMMENCER QUELQUES ACTIVITÉS QUOTIDIENNES NORMALES "); 
        listSpinnerQuestionK3.add("INCAPACITÉ À CAUSE D’UNE PERTE D’ÉNERGIE, DE COMMENCER  TOUTE ACTIVITÉ QUOTIDIENNE HABITUELLE "); 

        dataAdapterSpinnerQuestionK3 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionK3);
        
        List<String> listSpinnerQuestionK4a = new ArrayList<String>();
        listSpinnerQuestionK4a.add("pas de douleur ");
        listSpinnerQuestionK4a.add("douleur présente, mais pas dans les 3 derniers  jours");  
        listSpinnerQuestionK4a.add("douleur présente 1ou 2 jours ");
        listSpinnerQuestionK4a.add("douleur quotidienne ");

        dataAdapterSpinnerQuestionK4a = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionK4a);
        
        List<String> listSpinnerQuestionK4b = new ArrayList<String>();
        listSpinnerQuestionK4b.add("pas de douleur ");
        listSpinnerQuestionK4b.add("douleurs légères");  
        listSpinnerQuestionK4b.add("douleurs moyennes");
        listSpinnerQuestionK4b.add("douleurs fortes");
        listSpinnerQuestionK4b.add("périodes de douleur atroce ou intolérable");

        dataAdapterSpinnerQuestionK4b = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionK4b);
        
        List<String> listSpinnerQuestionK4c = new ArrayList<String>();
        listSpinnerQuestionK4c.add("n’est pas adéquat lorsque aucune douleur");
        listSpinnerQuestionK4c.add("douleurs suffisamment maîtrisées");  
        listSpinnerQuestionK4c.add("pas d’adaptation nécessaire de la thérapie");
        listSpinnerQuestionK4c.add("des douleurs sont présentes mais les médicaments ne sont pas pris");
        listSpinnerQuestionK4c.add("douleurs insuffisamment maîtrisées, adaptation nécessaire de la thérapie ");

        dataAdapterSpinnerQuestionK4c = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionK4c);
        
        dataAdapterSpinnerQuestionK5 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        		
        dataAdapterSpinnerQuestionK6 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;

        List<String> listSpinnerQuestionK7 = new ArrayList<String>();
        listSpinnerQuestionK7.add("non ");
        listSpinnerQuestionK7.add("oui ");  
        listSpinnerQuestionK7.add("la cliente ne répond pas ");
        
        dataAdapterSpinnerQuestionK7 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionK7) ;
        
        dataAdapterSpinnerQuestionK8 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        dataAdapterSpinnerQuestionL2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        List<String> listSpinnerQuestionL3 = new ArrayList<String>();
        listSpinnerQuestionL3.add("NORMAL – AVALE TOUTES LES SORTES DE NOURRITURE  ");
        listSpinnerQuestionL3.add("REQUIERT DES MODIFICATIONS DES ALIMENTS SOLIDES POUR LES AVALER (PAR EX. HACHÉE, BROYÉE) ");  
        listSpinnerQuestionL3.add("REQUIERT DES MODIFICATIONS POUR AVALER LES ALIMENTS SOLIDES ET LIQUIDES (PAR EX. BROYÉE, LIQUIDE ÉPAISSIS) ");
        listSpinnerQuestionL3.add("ALIMENTATION COMBINEE PAR VOIE ORALE E PAR SONDE ");  
        listSpinnerQuestionL3.add("AUCUNE ALIMENTATION ORALE");
        
        dataAdapterSpinnerQuestionL3 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionL3) ;
        
        dataAdapterSpinnerQuestionL4 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        List<String> listSpinnerQuestionL5 = new ArrayList<String>();
        listSpinnerQuestionL5.add("non ");
        listSpinnerQuestionL5.add("oui (problèmes présents) "); 
        
        dataAdapterSpinnerQuestionL5 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionL5) ;
        
        dataAdapterSpinnerQuestionL6 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        dataAdapterSpinnerQuestionM1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        List<String> listSpinnerQuestionM2 = new ArrayList<String>();
        listSpinnerQuestionM2.add("stade 1 : zone de rougeur persistante (peau intacte) qui ne disparaît pas si la pression est levée  ");
        listSpinnerQuestionM2.add("stade 2 : perte  partielle des couches de la peau, abrasion,  cratère superficiel  ");  
        listSpinnerQuestionM2.add("stade 3 : altération complète de la peau (cratère profond) qui peut envahir les tissus adjacents  ");
        listSpinnerQuestionM2.add("stade 4 : lésions de la peau et des tissus sous-cutanés exposant le muscle ou l'os. ");

        dataAdapterSpinnerQuestionM2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionM2) ;
        
     
        dataAdapterSpinnerQuestionM3 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        dataAdapterSpinnerQuestionM4 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        dataAdapterSpinnerQuestionN1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        List<String> listSpinnerQuestionO1 = new ArrayList<String>();
        listSpinnerQuestionO1.add("non ");
        listSpinnerQuestionO1.add("oui mais prestation terminée ");  
        listSpinnerQuestionO1.add("oui, prestation en cours");
        
        dataAdapterSpinnerQuestionO1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionO1) ;
        
        List<String> listSpinnerQuestionO2 = new ArrayList<String>();
        listSpinnerQuestionO2.add("non ");
        listSpinnerQuestionO2.add("oui, par un médecin installé ");  
        listSpinnerQuestionO2.add("oui, par un médecin hospitalier ");
        
        dataAdapterSpinnerQuestionO2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionO2) ;
        
        
        List<String> listSpinnerQuestionP2a = new ArrayList<String>();
        listSpinnerQuestionP2a.add("le client");
        listSpinnerQuestionP2a.add("le SAD");  
        listSpinnerQuestionP2a.add("autres");
       
        dataAdapterSpinnerQuestionP2a= new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionP2a) ;
        
        
        List<String> listSpinnerQuestionP2b = new ArrayList<String>();
        listSpinnerQuestionP2b.add("chaque jour");
        listSpinnerQuestionP2b.add("chaque semaine");  
        listSpinnerQuestionP2b.add("autre");
       
        dataAdapterSpinnerQuestionP2b= new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionP2b) ;
        
        
        List<String> listSpinnerQuestionP3 = new ArrayList<String>();
        listSpinnerQuestionP3.add("Une liste actualisée des médicaments avec dosage existe ");
        listSpinnerQuestionP3.add("Il faut établir une liste des médicaments avec dosage (voir feuille annexe)");  
        listSpinnerQuestionP3.add("Une liste des médicaments n’est pas nécessaire ");
       
        dataAdapterSpinnerQuestionP3= new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionP3) ;
        

        List<String> listSpinnerQuestionP4 = new ArrayList<String>();
        listSpinnerQuestionP4.add("pas connues");
        listSpinnerQuestionP4.add("connues (voir annexe)");  
       
        dataAdapterSpinnerQuestionP4 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionP4) ;
        
        dataAdapterSpinnerQuestionP5 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        List<String> listSpinnerQuestionP6 = new ArrayList<String>();
        listSpinnerQuestionP6.add("oui, toujours ");
        listSpinnerQuestionP6.add("à 80% du temps ou plus");  
        listSpinnerQuestionP6.add("à moins de 80% du temps (y.c. le fait de ne pas avoir  acheté les médicaments prescrits)");  

        dataAdapterSpinnerQuestionP6 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionP6) ;
        
        List<String> listSpinnerQuestionP7 = new ArrayList<String>();
        listSpinnerQuestionP7.add("La totalité des médicaments a été discutée au moins  avec un médecin/un pharmacien");
        listSpinnerQuestionP7.add("La totalité des médicaments n’a pas été contrôlée  par un médecin/un pharmacien");  

        dataAdapterSpinnerQuestionP7 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionP7) ;
      
        dataAdapterSpinnerQuestionQ1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        List<String> listSpinnerQuestionQ2 = new ArrayList<String>();
        listSpinnerQuestionQ2.add("amélioré ");
        listSpinnerQuestionQ2.add("pas de modification ");  
        listSpinnerQuestionQ2.add("détérioré ");  

        
        dataAdapterSpinnerQuestionQ2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        
        dataAdapterSpinnerQuestionQ3 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon) ;
        
        
        List<String> listSpinnerQuestionR1 = new ArrayList<String>();
        listSpinnerQuestionR1.add("non ");
        listSpinnerQuestionR1.add("oui ");  
        listSpinnerQuestionR1.add("la cliente ne répond pas  "); 
        
        dataAdapterSpinnerQuestionR1 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionR1) ;
        
        List<String> listSpinnerQuestionR2 = new ArrayList<String>();
        listSpinnerQuestionR2.add("non ");
        listSpinnerQuestionR2.add("oui "); 
        listSpinnerQuestionR2.add("non pertinent pour la situation ");  
        listSpinnerQuestionR2.add("la cliente ne répond pas  "); 
        
        dataAdapterSpinnerQuestionR2 = new ArrayAdapter<String>(getActivity(),
        		android.R.layout.simple_spinner_item, listSpinnerQuestionR2) ;
        
        listView.setAdapter(adapter); 
        listView.setOnItemClickListener(new OnItemClickListener() {

 			@Override
 			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
 					long id) {
                final LinearLayout lm = (LinearLayout) rootView.findViewById(R.id.LinearLayoutFormulaire);

 				 // ListView Clicked item index
                int itemPosition = position;
 /////////////////////////////////// A /////////////////////////////////////////////////            
                if(itemPosition == 0)
                {
                    ////////////////////  Question 1 //////////////////////
                    lm.removeAllViews();

                	 // ListView Clicked item value
                    String  itemValue    = (String) listView.getItemAtPosition(position);
                       
                     // Show Alert 
                     Toast.makeText(getActivity().getApplicationContext(),
                       "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                       .show();
                     
                     // create the layout params that will be used to define how your
                     // button will be displayed
                     LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                             LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                      
                          // Create TextView
                        TextView textViewQuestion1 = new TextView(getActivity());
                        textViewQuestion1.setText("1 DEBUT DE LA DOCUMENTATION");
                       lm.addView(textViewQuestion1);

                          
                         ImageButton imageDatePickerQuestion1 = new ImageButton(getActivity());
                         imageDatePickerQuestion1.setImageResource(R.drawable.calendar_icon);
                 
                         final EditText edittextQuestion1 = new EditText(getActivity());
                         edittextQuestion1.setEnabled(false);
                        lm.addView(edittextQuestion1);
                          
                        imageDatePickerQuestion1.setOnClickListener(new OnClickListener() {
                                 public void onClick(View v) {
                                      
                                     Log.i("TAG", "index :");
                                      
                                     Toast.makeText(getActivity().getApplicationContext(), 
                                             "Clicked Button Index :", 
                                             Toast.LENGTH_LONG).show();
                                     DialogFragment newFragmentDialogDate = new DatePickerFragment(){
                     	                @Override
                     	                public void onDateSet(DatePicker view, int year, int month, int day) {
                     	                	Date d = new Date(year, month, day);
                     	                	edittextQuestion1.setText(d.toString());
                     	                }
                     	             };;
                     	            newFragmentDialogDate.show(getFragmentManager(), "timePicker");
                             
                                 }
                             });
                              
                  
                            //Add button to LinearLayout defined in XML
                             lm.addView(imageDatePickerQuestion1);  
             //////////////////// End Question 1 //////////////////////
                             
            ////////////////////  Question 2 //////////////////////
                    TextView TextViewQuestion2 = new TextView(getActivity());
                    TextViewQuestion2.setText("2 RAISON DE L'EVALUATION");
                    lm.addView(TextViewQuestion2);

                    Spinner spinnerQuestion2 = new Spinner(getActivity());
                    dataAdapterSpinnerQuestion2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerQuestion2.setAdapter(dataAdapterSpinnerQuestion2);          
                    lm.addView(spinnerQuestion2);
                
                //////////////////// End Question 2 //////////////////////

                ////////////////////  Question 3 //////////////////////
                TextView TextViewQuestion3 = new TextView(getActivity());
                TextViewQuestion3.setText("3 Situation de la cliente");
                lm.addView(TextViewQuestion3);
                
                TextView TextViewQuestion3a = new TextView(getActivity());
                TextViewQuestion3a.setText("Avec qui vit la cliente au moment de l’intervention du SAD?");
                lm.addView(TextViewQuestion3a);
                
                Spinner spinnerQuestion3a = new Spinner(getActivity());
                dataAdapterSpinnerQuestion3a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerQuestion3a.setAdapter(dataAdapterSpinnerQuestion3a);          
                lm.addView(spinnerQuestion3a);
                
                TextView TextViewQuestion3b = new TextView(getActivity());
                TextViewQuestion3b.setText("Où vit la cliente au moment de l’intervention du SAD?");
                lm.addView(TextViewQuestion3b);
                
                Spinner spinnerQuestion3b = new Spinner(getActivity());
                dataAdapterSpinnerQuestion3b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerQuestion3b.setAdapter(dataAdapterSpinnerQuestion3b);          
                lm.addView(spinnerQuestion3b);
                
                TextView TextViewQuestion3c = new TextView(getActivity());
                TextViewQuestion3c.setText("Séjour à l’hôpital – La cliente a-t-elle été, dans les 90 der- niers jours, à l’hôpital ou dans une clinique?");
                lm.addView(TextViewQuestion3c);
                
                Spinner spinnerQuestion3c = new Spinner(getActivity());
                dataAdapterSpinnerQuestion3c.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerQuestion3c.setAdapter(dataAdapterSpinnerQuestion3c);          
                lm.addView(spinnerQuestion3c);
                
                
                //////////////////// End Question 3 //////////////////////

              TextView TextViewQuestionSectionA = new TextView(getActivity());
              TextViewQuestionSectionA.setText("SECTION  A.  REMARQUES SUPPLEMENTAIRE");
              lm.addView(TextViewQuestionSectionA);
              
              EditText edittextSectionA = new EditText(getActivity());
              lm.addView(edittextSectionA);
                
                }
//////////////////////////// End A ///////////////////////////
                
/////////////////////////////////// B /////////////////////////////////////////////////            
                if(itemPosition == 1)
                {
                    lm.removeAllViews();
                    
                    TextView TextViewQuestionB1 = new TextView(getActivity());
                    TextViewQuestionB1.setText("1 MÉMOIRE ET CAPACITÉ DE RAPPEL - Coder le souvenir de ce qui a été appris ou était connu");
                    lm.addView(TextViewQuestionB1);
                    
                    TextView TextViewQuestionB1a = new TextView(getActivity());
                    TextViewQuestionB1a.setText("a mémoire à court terme = semble se souvenir au bout de 5 minutes ");
                    lm.addView(TextViewQuestionB1a);
                    
                    Spinner spinnerQuestionB1a = new Spinner(getActivity());
                    dataAdapterSpinnerQuestionB1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerQuestionB1a.setAdapter(dataAdapterSpinnerQuestionB1);          
                    lm.addView(spinnerQuestionB1a);
                    
                    TextView TextViewQuestionB1b = new TextView(getActivity());
                    TextViewQuestionB1b.setText("b mémoire procédurale = accomplit toutes ou la plupart des étapes d’une tâche sans indication pour les commencer ");
                    lm.addView(TextViewQuestionB1b);
                    
                    Spinner spinnerQuestionB1b = new Spinner(getActivity());
                    dataAdapterSpinnerQuestionB1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerQuestionB1b.setAdapter(dataAdapterSpinnerQuestionB1);          
                    lm.addView(spinnerQuestionB1b);
                    
                    
                    final TextView TextViewQuestionB2 = new TextView(getActivity());
                    TextViewQuestionB2.setText("2 FACULTES COGNITIVES POUR LES DECISIONS COURANTES - Comment la cliente prend-elle ses décisions pour organiser sa journée? (par ex., l'heure de se lever, de manger, les habits à porter ou les activités à accomplir)");
                    lm.addView(TextViewQuestionB2);
                    
                    final Spinner spinnerQuestionB2 = new Spinner(getActivity());
                    dataAdapterSpinnerQuestionB2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerQuestionB2.setAdapter(dataAdapterSpinnerQuestionB2); 
                    
                    spinnerQuestionB2.setOnItemSelectedListener(new OnItemSelectedListener() {

						@Override
						public void onItemSelected(AdapterView<?> arg0, View arg1,
                                int arg2, long arg3) {
                       if(spinnerQuestionB2.getSelectedItemId()== 0 || spinnerQuestionB2.getSelectedItemId()==1)
                    
	                       {
                    	   TextViewQuestionBS3.setVisibility(View.GONE);

                    	   TextViewQuestionB3a.setVisibility(View.GONE);
                    	   
                    	   spinnerQuestionB3a.setVisibility(View.GONE);
                    	   
                    	   TextViewQuestionB3b.setVisibility(View.GONE);
	                    	  
                    	   spinnerQuestionB3b.setVisibility(View.GONE);
                    	   
                    	   TextViewQuestionB3c.setVisibility(View.GONE);
                    	   
                    	   spinnerQuestionB3c.setVisibility(View.GONE);
                    	   
                    	   TextViewQuestionB4.setVisibility(View.GONE);
                    	   
                    	   spinnerQuestionB4.setVisibility(View.GONE);
                    	   
                    	   TextViewQuestionB5.setVisibility(View.GONE);
                    	   
                    	   spinnerQuestionB5.setVisibility(View.GONE);

	                       }
                       else 
	                       {
	                    	   TextViewQuestionBS3.setVisibility(View.VISIBLE);
	
	                    	   TextViewQuestionB3a.setVisibility(View.VISIBLE);
	                    	   
	                    	   spinnerQuestionB3a.setVisibility(View.VISIBLE);
	                    	  
	                    	   TextViewQuestionB3b.setVisibility(View.VISIBLE);
	                    	  
	                    	   spinnerQuestionB3b.setVisibility(View.VISIBLE);
	                    	   
	                    	   TextViewQuestionB3c.setVisibility(View.VISIBLE);
	                    	   
	                    	   spinnerQuestionB3c.setVisibility(View.VISIBLE);
	                    	   
	                    	   TextViewQuestionB4.setVisibility(View.VISIBLE);
	                    	   
	                    	   spinnerQuestionB4.setVisibility(View.VISIBLE);
	                     	   
	                    	   TextViewQuestionB5.setVisibility(View.VISIBLE);
	                    	   
	                    	   spinnerQuestionB5.setVisibility(View.VISIBLE);
	                       }
						}

						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

                    });

                    lm.addView(spinnerQuestionB2);
                    
                    TextViewQuestionBS3= new TextView(getActivity());
                    TextViewQuestionBS3.setText("3 SIGNES D’ETAT CONFUSIONNEL (DELIRIUM) 0 ");
                    lm.addView(TextViewQuestionBS3);

                     TextViewQuestionB3a= new TextView(getActivity());
                    TextViewQuestionB3a.setText("a. FACILEMENT DISTRAIT (p.ex. difficulté de concentration,  dévie de son sujet)");
                    lm.addView(TextViewQuestionB3a);
                    
                     spinnerQuestionB3a = new Spinner(getActivity());
                    dataAdapterSpinnerQuestionB3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerQuestionB3a.setAdapter(dataAdapterSpinnerQuestionB3);          
                    lm.addView(spinnerQuestionB3a);
                    
                    TextViewQuestionB3b= new TextView(getActivity());
                    TextViewQuestionB3b.setText("b. EPISODES DE DISCOURS INCOHERENT (p.ex. discours dénué  de  sens ou hors de propos, sautant d’un sujet à l’autre, sans suite logique)");
                    lm.addView(TextViewQuestionB3b);
                    
                    spinnerQuestionB3b = new Spinner(getActivity());
                    dataAdapterSpinnerQuestionB3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerQuestionB3b.setAdapter(dataAdapterSpinnerQuestionB3);          
                    lm.addView(spinnerQuestionB3b);
                    
                    TextViewQuestionB3c= new TextView(getActivity());
                    TextViewQuestionB3c.setText("c. FONCTIONS MENTALES VARIANT EN COURS DE JOURNEE (p.ex. tantôt mieux, tantôt pire, comportement tantôt pré- sent, tantôt absent)");
                    lm.addView(TextViewQuestionB3c);
                    
                    spinnerQuestionB3c = new Spinner(getActivity());
                    dataAdapterSpinnerQuestionB3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerQuestionB3c.setAdapter(dataAdapterSpinnerQuestionB3);          
                    lm.addView(spinnerQuestionB3c);
                    
                    TextViewQuestionB4= new TextView(getActivity());
                    TextViewQuestionB4.setText("4  CHANGEMENT AIGU DES CAPACITES COGNITIVES EN COMPARAISON AVEC L’ETAT HABITUEL DE LA CLIENTE – par ex. agitation, léthargie, difficile à réveiller, perception  modifiée de l’environnement ");
                    lm.addView(TextViewQuestionB4);
                    
                    spinnerQuestionB4 = new Spinner(getActivity());
                    dataAdapterSpinnerQuestionB4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerQuestionB4.setAdapter(dataAdapterSpinnerQuestionB4);          
                    lm.addView(spinnerQuestionB4);
                    
                    
                    TextViewQuestionB5= new TextView(getActivity());
                    TextViewQuestionB5.setText("5 CHANGEMENT DES FACULTES COGNITIVES POUR  LES DECISIONS COURANTES DANS LES 90 DERNIERS JOURS (OU DEPUIS LA DERNIERE EVALUATION SI CELLE-CI EST PLUS RECENTE)");
                    lm.addView(TextViewQuestionB5);
                    
                    spinnerQuestionB5 = new Spinner(getActivity());
                    dataAdapterSpinnerQuestionB5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerQuestionB5.setAdapter(dataAdapterSpinnerQuestionB5);          
                    lm.addView(spinnerQuestionB5);
                    
                    TextView TextViewQuestionSectionB = new TextView(getActivity());
                    TextViewQuestionSectionB.setText("SECTION  B.  REMARQUES SUPPLEMENTAIRE");
                    lm.addView(TextViewQuestionSectionB);
                    
                    EditText edittextSectionB = new EditText(getActivity());
                    lm.addView(edittextSectionB);
                      
                      
                }
                //////////////////////////// End B ///////////////////////////

/////////////////////////////////// C /////////////////////////////////////////////////            
				if(itemPosition == 2)
				{
				  lm.removeAllViews();
				  
				  TextView TextViewQuestionC1 = new TextView(getActivity());
				  TextViewQuestionC1.setText("1 SE FAIRE COMPRENDRE  La cliente se fait-elle comprendre par  les autres? ");
				  lm.addView(TextViewQuestionC1);
				  
				  Spinner spinnerQuestionC1 = new Spinner(getActivity());
				  dataAdapterSpinnerQuestionC1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				  spinnerQuestionC1.setAdapter(dataAdapterSpinnerQuestionC1);          
				  lm.addView(spinnerQuestionC1);
				  
				 TextView TextViewQuestionC2 = new TextView(getActivity());
				 TextViewQuestionC2.setText("2 CAPACITE A COMPRENDRE LES AUTRES");
				 lm.addView(TextViewQuestionC2);
				 
				 Spinner spinnerQuestionC2 = new Spinner(getActivity());
				 dataAdapterSpinnerQuestionC2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				 spinnerQuestionC2.setAdapter(dataAdapterSpinnerQuestionC2);          
				 lm.addView(spinnerQuestionC2);
				  
				 TextView TextViewQuestionC3 = new TextView(getActivity());
				 TextViewQuestionC3.setText("3 AUDITION  (Avec appareil auditif, si utilisé, la cliente …)");
				 lm.addView(TextViewQuestionC3);
				 
				 Spinner spinnerQuestionC3 = new Spinner(getActivity());
				 dataAdapterSpinnerQuestionC3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				 spinnerQuestionC3.setAdapter(dataAdapterSpinnerQuestionC3);          
				 lm.addView(spinnerQuestionC3);
				 
				  TextView TextViewQuestionSectionC = new TextView(getActivity());
				  TextViewQuestionSectionC.setText("SECTION  C.  REMARQUES SUPPLEMENTAIRE");
				  lm.addView(TextViewQuestionSectionC);
				  
				  EditText edittextSectionC = new EditText(getActivity());
				  lm.addView(edittextSectionC);
				 
				}
//////////////////////////// End C ///////////////////////////  

/////////////////////////////////// D /////////////////////////////////////////////////            
			if(itemPosition == 3)
			{
			lm.removeAllViews();
			
			TextView TextViewQuestionD1 = new TextView(getActivity());
			TextViewQuestionD1.setText("1 VISION - Capacité de voir, dans une lumière adéquate et avec lunettes, si utilisées ");
			lm.addView(TextViewQuestionD1);
			
			Spinner spinnerQuestionD1 = new Spinner(getActivity());
			dataAdapterSpinnerQuestionD1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionD1.setAdapter(dataAdapterSpinnerQuestionD1);          
			lm.addView(spinnerQuestionD1);
			
		
			TextView TextViewQuestionSectionD = new TextView(getActivity());
			TextViewQuestionSectionD.setText("SECTION  D.  REMARQUES SUPPLEMENTAIRE");
			lm.addView(TextViewQuestionSectionD);
			
			EditText edittextSectionD = new EditText(getActivity());
			lm.addView(edittextSectionD);

}
////////////////////////////End D ///////////////////////////  

/////////////////////////////////// E /////////////////////////////////////////////////            
			if(itemPosition == 4)
			{
			lm.removeAllViews();
			
			TextView TextViewQuestionE1 = new TextView(getActivity());
			TextViewQuestionE1.setText("1 SIGNES DE DEPRESSION, D’ANXIETE OU DE TRISTESS");
			lm.addView(TextViewQuestionE1);
			
			TextView TextViewQuestionE1a = new TextView(getActivity());
			TextViewQuestionE1a.setText("a. tient des propos négatifs");
			lm.addView(TextViewQuestionE1a);
			
			
			Spinner spinnerQuestionE1a = new Spinner(getActivity());
			dataAdapterSpinnerQuestionE1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionE1a.setAdapter(dataAdapterSpinnerQuestionE1);          
			lm.addView(spinnerQuestionE1a);
			
			TextView TextViewQuestionE1b = new TextView(getActivity());
			TextViewQuestionE1b.setText("b. colère continuelle envers soi-même ou envers les autres ");
			lm.addView(TextViewQuestionE1b);
			
			
			Spinner spinnerQuestionE1b = new Spinner(getActivity());
			dataAdapterSpinnerQuestionE1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionE1b.setAdapter(dataAdapterSpinnerQuestionE1);          
			lm.addView(spinnerQuestionE1b);
			
			TextView TextViewQuestionE1c = new TextView(getActivity());
			TextViewQuestionE1c.setText("c. expressions de craintes  paraissant non fondées ");
			lm.addView(TextViewQuestionE1c);
			
			
			Spinner spinnerQuestionE1c = new Spinner(getActivity());
			dataAdapterSpinnerQuestionE1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionE1c.setAdapter(dataAdapterSpinnerQuestionE1);          
			lm.addView(spinnerQuestionE1c);
			
			TextView TextViewQuestionE1d = new TextView(getActivity());
			TextViewQuestionE1d.setText("d. plaintes somatiques répétées ");
			lm.addView(TextViewQuestionE1d);
			
			
			Spinner spinnerQuestionE1d = new Spinner(getActivity());
			dataAdapterSpinnerQuestionE1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionE1d.setAdapter(dataAdapterSpinnerQuestionE1);          
			lm.addView(spinnerQuestionE1d);
			
			TextView TextViewQuestionE1e = new TextView(getActivity());
			TextViewQuestionE1e.setText("e. visage exprimant tristesse,  douleur, inquiétude");
			lm.addView(TextViewQuestionE1e);
			
			
			Spinner spinnerQuestionE1e = new Spinner(getActivity());
			dataAdapterSpinnerQuestionE1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionE1e.setAdapter(dataAdapterSpinnerQuestionE1);          
			lm.addView(spinnerQuestionE1e);
			
			TextView TextViewQuestionE2 = new TextView(getActivity());
			TextViewQuestionE2.setText("2 COMPORTEMENT PROBLEMATIQUE ");
			lm.addView(TextViewQuestionE2);
			
			TextView TextViewQuestionE2a = new TextView(getActivity());
			TextViewQuestionE2a.setText("a. déambulation/errance");
			lm.addView(TextViewQuestionE2a);
			
			
			Spinner spinnerQuestionE2a = new Spinner(getActivity());
			dataAdapterSpinnerQuestionE2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionE2a.setAdapter(dataAdapterSpinnerQuestionE2);          
			lm.addView(spinnerQuestionE2a);
			
			TextView TextViewQuestionE2b = new TextView(getActivity());
			TextViewQuestionE2b.setText("b. agressivité verbale");
			lm.addView(TextViewQuestionE2b);
			
			
			Spinner spinnerQuestionE2b = new Spinner(getActivity());
			dataAdapterSpinnerQuestionE2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionE2b.setAdapter(dataAdapterSpinnerQuestionE2);          
			lm.addView(spinnerQuestionE2b);
			
			TextView TextViewQuestionE2c = new TextView(getActivity());
			TextViewQuestionE2c.setText("c. agressivité physique");
			lm.addView(TextViewQuestionE2c);
			
			
			Spinner spinnerQuestionE2c = new Spinner(getActivity());
			dataAdapterSpinnerQuestionE2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionE2c.setAdapter(dataAdapterSpinnerQuestionE2);          
			lm.addView(spinnerQuestionE2c);
			
			TextView TextViewQuestionE2d = new TextView(getActivity());
			TextViewQuestionE2d.setText("d. comportement socialement inapproprié ");
			lm.addView(TextViewQuestionE2d);
			
			
			Spinner spinnerQuestionE2d = new Spinner(getActivity());
			dataAdapterSpinnerQuestionE2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionE2d.setAdapter(dataAdapterSpinnerQuestionE2);          
			lm.addView(spinnerQuestionE2d);
			
			TextView TextViewQuestionE2e = new TextView(getActivity());
			TextViewQuestionE2e.setText("e. résistance aux soins");
			lm.addView(TextViewQuestionE2e);
			
			
			Spinner spinnerQuestionE2e = new Spinner(getActivity());
			dataAdapterSpinnerQuestionE2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionE2e.setAdapter(dataAdapterSpinnerQuestionE2);          
			lm.addView(spinnerQuestionE2e);
			
			
			
			
			
			
			
			
			
			
			TextView TextViewQuestionSectionE = new TextView(getActivity());
			TextViewQuestionSectionE.setText("SECTION  E.  REMARQUES SUPPLEMENTAIRE");
			lm.addView(TextViewQuestionSectionE);
			
			EditText edittextSectionE = new EditText(getActivity());
			lm.addView(edittextSectionE);
			
			}
////////////////////////////End E ///////////////////////////  		
			
/////////////////////////////////// F /////////////////////////////////////////////////            
				if(itemPosition == 5)
				{
				lm.removeAllViews();
				
				TextView TextViewQuestionF1 = new TextView(getActivity());
				TextViewQuestionF1.setText("1  RELATIONS SOCIALES");
				lm.addView(TextViewQuestionF1);
				
				TextView TextViewQuestionFS1 = new TextView(getActivity());
				TextViewQuestionFS1.setText("Quand les activités suivantes ont-elles été effectuées? ");
				lm.addView(TextViewQuestionFS1); 
				
				TextView TextViewQuestionF1a = new TextView(getActivity());
				TextViewQuestionF1a.setText("a. Hobby ou activités liées à des intérêts de longue date");
				lm.addView(TextViewQuestionF1a);
				
				
				Spinner spinnerQuestionF1a = new Spinner(getActivity());
				dataAdapterSpinnerQuestionF1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionF1a.setAdapter(dataAdapterSpinnerQuestionF1);          
				lm.addView(spinnerQuestionF1a);
				
				TextView TextViewQuestionF1b = new TextView(getActivity());
				TextViewQuestionF1b.setText("a. Reçoit la visite d’amis ou membres de la famille");
				lm.addView(TextViewQuestionF1b);
				
				
				Spinner spinnerQuestionF1b = new Spinner(getActivity());
				dataAdapterSpinnerQuestionF1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionF1b.setAdapter(dataAdapterSpinnerQuestionF1);          
				lm.addView(spinnerQuestionF1b);
				
				TextView TextViewQuestionF1c = new TextView(getActivity());
				TextViewQuestionF1c.setText("a. Contacts par téléphone ou e-mail avec des amis ou parents ");
				lm.addView(TextViewQuestionF1c);
				
				
				Spinner spinnerQuestionF1c = new Spinner(getActivity());
				dataAdapterSpinnerQuestionF1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionF1c.setAdapter(dataAdapterSpinnerQuestionF1);          
				lm.addView(spinnerQuestionF1c);
				
				TextView TextViewQuestionF2 = new TextView(getActivity());
				TextViewQuestionF2.setText("2 CHANGEMENT DANS LES ACTIVITES SOCIALES Par rapport à il y a 3 mois, y a-t-il eu une diminution de l'implica- tion dans des activités habituelles (sociales, religieuses, de loisir ou autres)?  ");
				lm.addView(TextViewQuestionF2);
				
				Spinner spinnerQuestionF2 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionF2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionF2.setAdapter(dataAdapterSpinnerQuestionF2);          
				lm.addView(spinnerQuestionF2);
				
				TextView TextViewQuestionF3 = new TextView(getActivity());
				TextViewQuestionF3.setText("3 RELATIONS CONFLICTUELLES");
				lm.addView(TextViewQuestionF3);
				
				Spinner spinnerQuestionF3 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionF3AndF4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionF3.setAdapter(dataAdapterSpinnerQuestionF3AndF4);          
				lm.addView(spinnerQuestionF3);
				
				
				TextView TextViewQuestionF4 = new TextView(getActivity());
				TextViewQuestionF4.setText("SOLITUDE La cliente dit ou indique qu’elle se sent seule");
				lm.addView(TextViewQuestionF4);
				
				Spinner spinnerQuestionF4 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionF3AndF4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionF4.setAdapter(dataAdapterSpinnerQuestionF3AndF4);          
				lm.addView(spinnerQuestionF4);
				
				TextView TextViewQuestionSectionF = new TextView(getActivity());
				TextViewQuestionSectionF.setText("SECTION  F.  REMARQUES SUPPLEMENTAIRE");
				lm.addView(TextViewQuestionSectionF);
				
				EditText edittextSectionF = new EditText(getActivity());
				lm.addView(edittextSectionF);
				
				}
////////////////////////////End F /////////////////////////// 
				
				
				
/////////////////////////////////// G /////////////////////////////////////////////////            
				if(itemPosition == 6)
				{
				lm.removeAllViews();
				
				TextView TextViewQuestionG1 = new TextView(getActivity());
				TextViewQuestionG1.setText("1 EXISTE-T-IL UN/DES AIDANTS PRINCIPAUX?");
				lm.addView(TextViewQuestionG1);
				
				final Spinner spinnerQuestionG1 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionG1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionG1.setAdapter(dataAdapterSpinnerQuestionG1);    
				spinnerQuestionG1.setOnItemSelectedListener(new OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> arg0, View arg1,
                            int arg2, long arg3) {
                   if(spinnerQuestionG1.getSelectedItemId()== 0 )
                
                       {
                	   TextViewQuestionG2.setVisibility(View.GONE);
                	   TextViewQuestionG2a.setVisibility(View.GONE);
                	   spinnerQuestionG2a.setVisibility(View.GONE);
                	   TextViewQuestionG2b.setVisibility(View.GONE);
                	   spinnerQuestionG2b.setVisibility(View.GONE);
                	   TextViewQuestionG3.setVisibility(View.GONE);
                	   table.setVisibility(View.GONE);
                       }
                   else 
                       {
                	   TextViewQuestionG2.setVisibility(View.VISIBLE);
                	   TextViewQuestionG2a.setVisibility(View.VISIBLE);
                	   spinnerQuestionG2a.setVisibility(View.VISIBLE);
                	   TextViewQuestionG2b.setVisibility(View.VISIBLE);
                	   spinnerQuestionG2b.setVisibility(View.VISIBLE);
                	   TextViewQuestionG3.setVisibility(View.VISIBLE);
                	   table.setVisibility(View.VISIBLE);
                       }
					}

					@Override
					public void onNothingSelected(AdapterView<?> arg0) {
						// TODO Auto-generated method stub
						
					}

                });
				
				
				
				
				
				lm.addView(spinnerQuestionG1);
				

				 TextViewQuestionG2 = new TextView(getActivity());
				TextViewQuestionG2.setText("2 SITUATION DES AIDANTS");
				lm.addView(TextViewQuestionG2);
				
				 TextViewQuestionG2a = new TextView(getActivity());
				TextViewQuestionG2a.setText("a. Le (les) aidant(s) ne peut plus continuer son aide");
				lm.addView(TextViewQuestionG2a);

				spinnerQuestionG2a = new Spinner(getActivity());
				dataAdapterSpinnerQuestionG2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionG2a.setAdapter(dataAdapterSpinnerQuestionG2);          
				lm.addView(spinnerQuestionG2a);
				
				TextViewQuestionG2b = new TextView(getActivity());
				TextViewQuestionG2b.setText("b. Le (les) aidant(s) exprime des sentiments de fardeau familial, colère ou dépression");
				lm.addView(TextViewQuestionG2b);

				spinnerQuestionG2b = new Spinner(getActivity());
				dataAdapterSpinnerQuestionG2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionG2b.setAdapter(dataAdapterSpinnerQuestionG2);          
				lm.addView(spinnerQuestionG2b);
				
			    TextViewQuestionG3 = new TextView(getActivity());
				TextViewQuestionG3.setText("3  AIDE DONNEE - Notez ci-dessous les renseignements et le nb d’heures concernant l’aide donnée au cours des 7 derniers jours  (ne comptez que l’aide pour les AVQ, les soins infirmiers et la gestion des médicaments, sans l’aide aux autres AIVQ) Nom ");
				lm.addView(TextViewQuestionG3);
				


				
				
				
			   table = new TableLayout(getActivity());

		        table.setStretchAllColumns(true);
		        table.setShrinkAllColumns(true);

		        TableRow rowTitle = new TableRow(getActivity());
		        rowTitle.setGravity(Gravity.CENTER_HORIZONTAL);

		        TableRow rowHedear= new TableRow(getActivity());
		        TableRow rowRow1 = new TableRow(getActivity());
		        TableRow rowRow2 = new TableRow(getActivity());
		        TableRow rowRow3 = new TableRow(getActivity());

		        TextView empty = new TextView(getActivity());


		        //  1 column
		        
		        TextView textViewTableTitleHeader1 = new TextView(getActivity());
		        textViewTableTitleHeader1.setText("Nom de l’aidant informel");
		        textViewTableTitleHeader1.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        
		        TextView textViewTableCella= new TextView(getActivity());
		        textViewTableCella.setText("a");
		        textViewTableCella.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCella= new EditText(getActivity());
		        editTextTableCella.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        TextView textViewTableCelle = new TextView(getActivity());
		        textViewTableCelle.setText("e");
		        textViewTableCelle.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCelle= new EditText(getActivity());
		        editTextTableCelle.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        TextView textViewTableCelli = new TextView(getActivity());
		        textViewTableCelli.setText("i");
		        textViewTableCelli.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCelli= new EditText(getActivity());
		        editTextTableCelli.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        rowHedear.addView(textViewTableTitleHeader1);
		        rowRow1.addView(textViewTableCella);
		        rowRow1.addView(editTextTableCella);
		        rowRow2.addView(textViewTableCelle);
		        rowRow2.addView(editTextTableCelle);
		        rowRow3.addView(textViewTableCelli);
		        rowRow3.addView(editTextTableCelli);

  //  2 column
		        TextView textViewTableTitleHeader2 = new TextView(getActivity());

		        textViewTableTitleHeader2.setText("Relation avec la cliente");
		        textViewTableTitleHeader2.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        
		        TextView textViewTableCellb= new TextView(getActivity());
		        textViewTableCellb.setText("b");
		        textViewTableCellb.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCellb= new EditText(getActivity());
		        editTextTableCellb.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        TextView textViewTableCellf = new TextView(getActivity());
		        textViewTableCellf.setText("f");
		        textViewTableCellf.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCellf= new EditText(getActivity());
		        editTextTableCellf.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        TextView textViewTableCellj = new TextView(getActivity());
		        textViewTableCellj.setText("j");
		        textViewTableCellj.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCellj= new EditText(getActivity());
		        editTextTableCellj.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        rowHedear.addView(textViewTableTitleHeader2);
		        rowRow1.addView(textViewTableCellb);
		        rowRow1.addView(editTextTableCellb);
		        rowRow2.addView(textViewTableCellf);
		        rowRow2.addView(editTextTableCellf);
		        rowRow3.addView(textViewTableCellj);
		        rowRow3.addView(editTextTableCellj);
//  3 column
		        TextView textViewTableTitleHeader3 = new TextView(getActivity());

		        textViewTableTitleHeader3.setText("Nature de l’aide ou autre information utile");
		        textViewTableTitleHeader3.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        
		        TextView textViewTableCellc= new TextView(getActivity());
		        textViewTableCellc.setText("c");
		        textViewTableCellc.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCellc= new EditText(getActivity());
		        editTextTableCellc.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        TextView textViewTableCellg = new TextView(getActivity());
		        textViewTableCellg.setText("g");
		        textViewTableCellg.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCellg= new EditText(getActivity());
		        editTextTableCellg.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        TextView textViewTableCellk = new TextView(getActivity());
		        textViewTableCellk.setText("k");
		        textViewTableCellk.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCellk= new EditText(getActivity());
		        editTextTableCellk.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        rowHedear.addView(textViewTableTitleHeader3);
		        rowRow1.addView(textViewTableCellc);
		        rowRow1.addView(editTextTableCellc);
		        rowRow2.addView(textViewTableCellg);
		        rowRow2.addView(editTextTableCellg);
		        rowRow3.addView(textViewTableCellk);
		        rowRow3.addView(editTextTableCellk);

//  3 column
		        TextView textViewTableTitleHeader4 = new TextView(getActivity());

		        textViewTableTitleHeader4.setText("Nb. heures/ semaine");
		        textViewTableTitleHeader4.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        
		        TextView textViewTableCelld= new TextView(getActivity());
		        textViewTableCelld.setText("d");
		        textViewTableCelld.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCelld= new EditText(getActivity());
		        editTextTableCelld.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        TextView textViewTableCellh = new TextView(getActivity());
		        textViewTableCellh.setText("h");
		        textViewTableCellh.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCellh= new EditText(getActivity());
		        editTextTableCellh.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        TextView textViewTableCelll = new TextView(getActivity());
		        textViewTableCelll.setText("l");
		        textViewTableCelll.setGravity(Gravity.CENTER_HORIZONTAL);

		        EditText editTextTableCelll= new EditText(getActivity());
		        editTextTableCelll.setGravity(Gravity.CENTER_HORIZONTAL);
		        
		        rowHedear.addView(textViewTableTitleHeader4);
		        rowRow1.addView(textViewTableCelld);
		        rowRow1.addView(editTextTableCelld);
		        rowRow2.addView(textViewTableCellh);
		        rowRow2.addView(editTextTableCellh);
		        rowRow3.addView(textViewTableCelll);
		        rowRow3.addView(editTextTableCelll);
		        
		        
		        table.addView(rowHedear);
		        table.addView(rowRow1);
		        table.addView(rowRow2);
		        table.addView(rowRow3);
				
				
				lm.addView(table);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				TextView TextViewQuestionSectionG = new TextView(getActivity());
				TextViewQuestionSectionG.setText("SECTION  G.  REMARQUES SUPPLEMENTAIRE");
				lm.addView(TextViewQuestionSectionG);
				
				EditText edittextSectionG = new EditText(getActivity());
				lm.addView(edittextSectionG);
				
		
				
				}
////////////////////////////End G ///////////////////////////  	
/////////////////////////////////// H /////////////////////////////////////////////////            
				if(itemPosition == 7)
				{
				lm.removeAllViews();
				TextView TextViewQuestionHS1 = new TextView(getActivity());
				TextViewQuestionHS1.setText("1 AIVQ ");
				lm.addView(TextViewQuestionHS1);
				TextView TextViewQuestionHS11 = new TextView(getActivity());
				TextViewQuestionHS11.setText("Codez la performance de la personne pendant les 3 derniers jours sous la capacité de performance effective observée (A). Codez éga- lement la capacité de performance présumée (B). Cette estimation implique une certaine partie de suppositions ");
				lm.addView(TextViewQuestionHS11);
				
				TextView TextViewQuestionH1a = new TextView(getActivity());
				TextViewQuestionH1a.setText("a. préparation des repas ");
				lm.addView(TextViewQuestionH1a);
				
				Spinner spinnerQuestionH1a = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH1a.setAdapter(dataAdapterSpinnerQuestionH1);          
				lm.addView(spinnerQuestionH1a);
				
				
				TextView TextViewQuestionH1b = new TextView(getActivity());
				TextViewQuestionH1b.setText("b. ménage courant ");
				lm.addView(TextViewQuestionH1b);
				
				Spinner spinnerQuestionH1b = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH1b.setAdapter(dataAdapterSpinnerQuestionH1);          
				lm.addView(spinnerQuestionH1b);
				
				TextView TextViewQuestionH1c = new TextView(getActivity());
				TextViewQuestionH1c.setText("c. gestion de l’argent (dans les 30 derniers jours)  ");
				lm.addView(TextViewQuestionH1c);
				
				Spinner spinnerQuestionH1c = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH1c.setAdapter(dataAdapterSpinnerQuestionH1);          
				lm.addView(spinnerQuestionH1c);
				
				TextView TextViewQuestionH1d = new TextView(getActivity());
				TextViewQuestionH1d.setText("d. gestion des  médicaments");
				lm.addView(TextViewQuestionH1d);
				
				Spinner spinnerQuestionH1d = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH1d.setAdapter(dataAdapterSpinnerQuestionH1);          
				lm.addView(spinnerQuestionH1d);
				
				
				TextView TextViewQuestionH1e = new TextView(getActivity());
				TextViewQuestionH1e.setText("e. usage du téléphone");
				lm.addView(TextViewQuestionH1e);
				
				Spinner spinnerQuestionH1e = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH1e.setAdapter(dataAdapterSpinnerQuestionH1);          
				lm.addView(spinnerQuestionH1e);
				
				
				TextView TextViewQuestionH1f = new TextView(getActivity());
				TextViewQuestionH1f.setText("f. faire les courses ");
				lm.addView(TextViewQuestionH1f);
				
				Spinner spinnerQuestionH1f = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH1f.setAdapter(dataAdapterSpinnerQuestionH1);          
				lm.addView(spinnerQuestionH1f);
				
				TextView TextViewQuestionH1g = new TextView(getActivity());
				TextViewQuestionH1g.setText("g. utilisation des moyens de transport");
				lm.addView(TextViewQuestionH1g);
				
				Spinner spinnerQuestionH1g = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH1g.setAdapter(dataAdapterSpinnerQuestionH1);          
				lm.addView(spinnerQuestionH1g);
				
				TextView TextViewQuestionSectionH1 = new TextView(getActivity());
				TextViewQuestionSectionH1.setText("SECTION  H1.  REMARQUES SUPPLEMENTAIRE");
				lm.addView(TextViewQuestionSectionH1);
				
				EditText edittextSectionH1 = new EditText(getActivity());
				lm.addView(edittextSectionH1);
				
				TextView TextViewQuestionHS2 = new TextView(getActivity());
				TextViewQuestionHS2.setText("2 AVQ ");
				lm.addView(TextViewQuestionHS2);
				
				
				TextView TextViewQuestionH2a = new TextView(getActivity());
				TextViewQuestionH2a.setText("a.  mobilité dans le lit ");
				lm.addView(TextViewQuestionH2a);
				
				Spinner spinnerQuestionH2a = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH2a.setAdapter(dataAdapterSpinnerQuestionH2);          
				lm.addView(spinnerQuestionH2a);
				
				
				TextView TextViewQuestionH2b = new TextView(getActivity());
				TextViewQuestionH2b.setText("b. transfert (lit/chaise, se mettre debout) ");
				lm.addView(TextViewQuestionH2b);
				
				Spinner spinnerQuestionH2b = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH2b.setAdapter(dataAdapterSpinnerQuestionH2);          
				lm.addView(spinnerQuestionH2b);
				
				TextView TextViewQuestionH2c = new TextView(getActivity());
				TextViewQuestionH2c.setText("c. marche à l’intérieur sur le même étage  ");
				lm.addView(TextViewQuestionH2c);
				
				Spinner spinnerQuestionH2c = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH2c.setAdapter(dataAdapterSpinnerQuestionH2);          
				lm.addView(spinnerQuestionH2c);
				
				TextView TextViewQuestionH2d = new TextView(getActivity());
				TextViewQuestionH2d.setText("d. déplacement en chaise roulante sur le même étage ");
				lm.addView(TextViewQuestionH2d);
				
				Spinner spinnerQuestionH2d = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH2d.setAdapter(dataAdapterSpinnerQuestionH2);          
				lm.addView(spinnerQuestionH2d);
				
				
				TextView TextViewQuestionH2e = new TextView(getActivity());
				TextViewQuestionH2e.setText("e. déplacement à l’extérieur (avec/sans chaise roulante) ");
				lm.addView(TextViewQuestionH2e);
				
				Spinner spinnerQuestionH2e = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH2e.setAdapter(dataAdapterSpinnerQuestionH2);          
				lm.addView(spinnerQuestionH2e);
				
				
				TextView TextViewQuestionH2f = new TextView(getActivity());
				TextViewQuestionH2f.setText("f. s’habiller");
				lm.addView(TextViewQuestionH2f);
				
				Spinner spinnerQuestionH2f = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH2f.setAdapter(dataAdapterSpinnerQuestionH2);          
				lm.addView(spinnerQuestionH2f);
				
				TextView TextViewQuestionH2g = new TextView(getActivity());
				TextViewQuestionH2g.setText("g. manger, boire ");
				lm.addView(TextViewQuestionH2g);
				
				Spinner spinnerQuestionH2g = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH2g.setAdapter(dataAdapterSpinnerQuestionH2);          
				lm.addView(spinnerQuestionH2g);
				
				TextView TextViewQuestionH2h = new TextView(getActivity());
				TextViewQuestionH2h.setText("h. utilisation des toilettes ");
				lm.addView(TextViewQuestionH2h);
				
				Spinner spinnerQuestionH2h = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH2h.setAdapter(dataAdapterSpinnerQuestionH2);          
				lm.addView(spinnerQuestionH2h);
				
				TextView TextViewQuestionH2i = new TextView(getActivity());
				TextViewQuestionH2i.setText("i. hygiène personnelle (bain/douche exclus) ");
				lm.addView(TextViewQuestionH2i);
				
				Spinner spinnerQuestionH2i = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH2i.setAdapter(dataAdapterSpinnerQuestionH2);          
				lm.addView(spinnerQuestionH2i);
				
				TextView TextViewQuestionH2j = new TextView(getActivity());
				TextViewQuestionH2j.setText("j. bain, douche, toilette complète (coder l’épisode de dépendance maximale dans les 7 derniers jours) ");
				lm.addView(TextViewQuestionH2j);
				
				Spinner spinnerQuestionH2j = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH2j.setAdapter(dataAdapterSpinnerQuestionH2);          
				lm.addView(spinnerQuestionH2j);
				
				TextView TextViewQuestionHS3 = new TextView(getActivity());
				TextViewQuestionHS3.setText("3 CHANGEMENT DE PERFORMANCE DES AVQ ");
				lm.addView(TextViewQuestionHS3);
				
				TextView TextViewQuestionH3 = new TextView(getActivity());
				TextViewQuestionH3.setText("La performance de la  cliente dans les AVQ s’est-elle changée par rapport à il y a 3 mois (ou depuis la dernière évaluation si celle-ci est plus récente). ");
				lm.addView(TextViewQuestionH3);
				
				Spinner spinnerQuestionH3 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH3.setAdapter(dataAdapterSpinnerQuestionH3);          
				lm.addView(spinnerQuestionH3);
				
				
				TextView TextViewQuestionSectionH2ANDH3 = new TextView(getActivity());
				TextViewQuestionSectionH2ANDH3.setText("SECTION  H2/H3.  REMARQUES SUPPLEMENTAIRE");
				lm.addView(TextViewQuestionSectionH2ANDH3);
				
				EditText edittextSectionH2ANDH3 = new EditText(getActivity());
				lm.addView(edittextSectionH2ANDH3);
				
				TextView TextViewQuestionHS4 = new TextView(getActivity());
				TextViewQuestionHS4.setText("4 MONTER ET DESCENDRE LES ESCALIERS ");
				lm.addView(TextViewQuestionHS4);
				
				TextView TextViewQuestionH4 = new TextView(getActivity());
				TextViewQuestionH4.setText("Durant les 3 derniers jours, comment la cliente a-t-elle monté et descendu une ou plusieurs marches (en tenant la rampe si nécessaire)");
				lm.addView(TextViewQuestionH4);
				
				Spinner spinnerQuestionH4 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH4.setAdapter(dataAdapterSpinnerQuestionH4);          
				lm.addView(spinnerQuestionH4);
				
				TextView TextViewQuestionHS5 = new TextView(getActivity());
				TextViewQuestionHS5.setText("5 VOLUME D’ACITIVITES  ");
				lm.addView(TextViewQuestionHS5);
				
				
				TextView TextViewQuestionH5a = new TextView(getActivity());
				TextViewQuestionH5a.setText("a. Endurance – Nombre d’heures d’activité physique (p. ex. : marcher, faire le ménage, exercices) durant les   3 derniers jours 0 ");
				lm.addView(TextViewQuestionH5a);
				
				Spinner spinnerQuestionH5a = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH5a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH5a.setAdapter(dataAdapterSpinnerQuestionH5a);          
				lm.addView(spinnerQuestionH5a);
				
				TextView TextViewQuestionH5b = new TextView(getActivity());
				TextViewQuestionH5b.setText("b. Sortie de son domicile – Dans les 3 derniers jours, coder  le nombre de jours où la cliente est sortie de son   domicile, quelle que soit la durée de la sortie ");
				lm.addView(TextViewQuestionH5b);
				
				Spinner spinnerQuestionH5b = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH5b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH5b.setAdapter(dataAdapterSpinnerQuestionH5b);          
				lm.addView(spinnerQuestionH5b);
				
				TextView TextViewQuestionHS6 = new TextView(getActivity());
				TextViewQuestionHS5.setText("6 POTENTIEL FONCTIONNEL ");
				lm.addView(TextViewQuestionHS6);
				
				TextView TextViewQuestionH6a = new TextView(getActivity());
				TextViewQuestionH6a.setText("a. La cliente se sent capable d’atteindre une indépendance accrue pour les AVQ et les AIVQ ");
				lm.addView(TextViewQuestionH6a);
				
				Spinner spinnerQuestionH6a = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH6aAndb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH6a.setAdapter(dataAdapterSpinnerQuestionH6aAndb);          
				lm.addView(spinnerQuestionH6a);
				
				TextView TextViewQuestionH6b = new TextView(getActivity());
				TextViewQuestionH6b.setText("b. Les aidants professionnels estiment que la cliente peut  atteindre une indépendance accrue pour les AVQ et les  AIVQ");
				lm.addView(TextViewQuestionH6b);
				
				Spinner spinnerQuestionH6b = new Spinner(getActivity());
				dataAdapterSpinnerQuestionH6aAndb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionH6b.setAdapter(dataAdapterSpinnerQuestionH6aAndb);          
				lm.addView(spinnerQuestionH6b);
								
				TextView TextViewQuestionSectionH456 = new TextView(getActivity());
				TextViewQuestionSectionH456.setText("SECTION  H4-H6.  REMARQUES SUPPLEMENTAIRE");
				lm.addView(TextViewQuestionSectionH456);
				
				EditText edittextSectionH456 = new EditText(getActivity());
				lm.addView(edittextSectionH456);
				}
////////////////////////////End H //////////////////////////
//////////////////////////// I //////////////////////////

				if(itemPosition == 8)
				{
				lm.removeAllViews();
				TextView TextViewQuestionIS1 = new TextView(getActivity());
				TextViewQuestionIS1.setText("1 URINES ");
				lm.addView(TextViewQuestionIS1);
				
				TextView TextViewQuestionI1 = new TextView(getActivity());
				TextViewQuestionI1.setText("Contrôle de la fonction urinaire de la vessie durant LES 3 DERNIERS JOURS");
				lm.addView(TextViewQuestionI1);
				
				Spinner spinnerQuestionI1 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionI1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionI1.setAdapter(dataAdapterSpinnerQuestionI1);          
				lm.addView(spinnerQuestionI1);
				
				TextView TextViewQuestionIS2 = new TextView(getActivity());
				TextViewQuestionIS2.setText("2 SELLES ");
				lm.addView(TextViewQuestionIS2);
				
				TextView TextViewQuestionI2 = new TextView(getActivity());
				TextViewQuestionI2.setText("Contrôle des selles durant LES 3 DERNIERS JOURS");
				lm.addView(TextViewQuestionI2);
				
				Spinner spinnerQuestionI2 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionI2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionI2.setAdapter(dataAdapterSpinnerQuestionI2);          
				lm.addView(spinnerQuestionI2);
				
				TextView TextViewQuestionIS3 = new TextView(getActivity());
				TextViewQuestionIS3.setText("3 MOYENS DE PROTECTION  ");
				lm.addView(TextViewQuestionIS3);
				
				TextView TextViewQuestionI3a = new TextView(getActivity());
				TextViewQuestionI3a.setText("a. sonde urinaire à demeure avec collecteur d’urine (y.c. sus- pubienne) ");
				lm.addView(TextViewQuestionI3a);
				
				Spinner spinnerQuestionI3a = new Spinner(getActivity());
				dataAdapterSpinnerQuestionI3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionI3a.setAdapter(dataAdapterSpinnerQuestionI3);          
				lm.addView(spinnerQuestionI3a);
				
				TextView TextViewQuestionI3b = new TextView(getActivity());
				TextViewQuestionI3b.setText("b. sonde urinaire à demeure avec valve anti reflux  ");
				lm.addView(TextViewQuestionI3b);
				
				Spinner spinnerQuestionI3b = new Spinner(getActivity());
				dataAdapterSpinnerQuestionI3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionI3b.setAdapter(dataAdapterSpinnerQuestionI3);          
				lm.addView(spinnerQuestionI3b);
				
				TextView TextViewQuestionI3c = new TextView(getActivity());
				TextViewQuestionI3c.setText("c. sPenilex");
				lm.addView(TextViewQuestionI3c);
				
				Spinner spinnerQuestionI3c = new Spinner(getActivity());
				dataAdapterSpinnerQuestionI3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionI3c.setAdapter(dataAdapterSpinnerQuestionI3);          
				lm.addView(spinnerQuestionI3c);
				
				TextView TextViewQuestionI3d = new TextView(getActivity());
				TextViewQuestionI3d.setText("d. cystostomie, néphrostomie, ureterostomie");
				lm.addView(TextViewQuestionI3d);
				
				Spinner spinnerQuestionI3d = new Spinner(getActivity());
				dataAdapterSpinnerQuestionI3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionI3d.setAdapter(dataAdapterSpinnerQuestionI3);          
				lm.addView(spinnerQuestionI3d);
				
				TextView TextViewQuestionI3e = new TextView(getActivity());
				TextViewQuestionI3e.setText("e. stomie intestinale  ");
				lm.addView(TextViewQuestionI3e);
				
				Spinner spinnerQuestionI3e = new Spinner(getActivity());
				dataAdapterSpinnerQuestionI3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionI3e.setAdapter(dataAdapterSpinnerQuestionI3);          
				lm.addView(spinnerQuestionI3e);
				
				TextView TextViewQuestionI3f = new TextView(getActivity());
				TextViewQuestionI3f.setText("f. protections (p. ex.: couches, serviettes hygiéniques)");
				lm.addView(TextViewQuestionI3f);
				
				Spinner spinnerQuestionI3f = new Spinner(getActivity());
				dataAdapterSpinnerQuestionI3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionI3f.setAdapter(dataAdapterSpinnerQuestionI3);          
				lm.addView(spinnerQuestionI3f);
				
				
				TextView TextViewQuestionSectionI = new TextView(getActivity());
				TextViewQuestionSectionI.setText("SECTION I.  REMARQUES SUPPLEMENTAIRE");
				lm.addView(TextViewQuestionSectionI);
				
				EditText edittextSectionI = new EditText(getActivity());
				lm.addView(edittextSectionI);
				}
////////////////////////////End I //////////////////////////
//////////////////////////// J //////////////////////////

				if(itemPosition == 9)
				{
					lm.removeAllViews();

					TextView TextViewQuestionJ1 = new TextView(getActivity());
					TextViewQuestionJ1.setText("LES DIAGNOSTICS NECESSITANT DES SOINS ET UN ACCOM- PAGNEMENT A L’HEURE ACTUELLE, SONT-ILS RECONNUS?");
					lm.addView(TextViewQuestionJ1);
					
					final Spinner spinnerQuestionJ1 = new Spinner(getActivity());
					dataAdapterSpinnerQuestionJ1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinnerQuestionJ1.setAdapter(dataAdapterSpinnerQuestionJ1);  
					
					spinnerQuestionJ1.setOnItemSelectedListener(new OnItemSelectedListener() {

						@Override
						public void onItemSelected(AdapterView<?> arg0, View arg1,
	                            int arg2, long arg3) {
	                   if(spinnerQuestionJ1.getSelectedItemId()== 1 )
	                
	                       {
	                	   TextViewQuestionJ1a.setVisibility(View.GONE);
	                       edittextSectionJ1a1.setVisibility(View.GONE);
	                       edittextSectionJ1a2.setVisibility(View.GONE);
	                       edittextSectionJ1a3.setVisibility(View.GONE);
	                	
	                       }
	                   else 
	                       {
	                	   TextViewQuestionJ1a.setVisibility(View.VISIBLE);
	                       edittextSectionJ1a1.setVisibility(View.VISIBLE);
	                       edittextSectionJ1a2.setVisibility(View.VISIBLE);
	                       edittextSectionJ1a3.setVisibility(View.VISIBLE);
	                       }
						}

						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}

	                });
					
					
					lm.addView(spinnerQuestionJ1);
					
					 TextViewQuestionJ1a = new TextView(getActivity());
					TextViewQuestionJ1a.setText("a. Diagnostics de maladies affectant actuellement l’état de   san té de la cliente et influençant le besoin en aide et soins.");
					lm.addView(TextViewQuestionJ1a);
					
					
					 edittextSectionJ1a1 = new EditText(getActivity());
					lm.addView(edittextSectionJ1a1);
					
					 edittextSectionJ1a2 = new EditText(getActivity());
					lm.addView(edittextSectionJ1a2);
					
					 edittextSectionJ1a3 = new EditText(getActivity());
					lm.addView(edittextSectionJ1a3);
				}
////////////////////////////End J //////////////////////////
//////////////////////////// K  //////////////////////////

	if(itemPosition == 10)
	{
		lm.removeAllViews();
		
		TextView TextViewQuestionK1 = new TextView(getActivity());
		TextViewQuestionK1.setText("PROBLEMES DE SANTE");
		lm.addView(TextViewQuestionK1);
		
		TextView TextViewQuestionK1a = new TextView(getActivity());
		TextViewQuestionK1a.setText("diarrhée ");
		lm.addView(TextViewQuestionK1a);
		
		Spinner spinnerQuestionK1a = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1a.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1a);
		
		TextView TextViewQuestionK1b = new TextView(getActivity());
		TextViewQuestionK1b.setText("constipation ");
		lm.addView(TextViewQuestionK1b);
		
		Spinner spinnerQuestionK1b = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1b.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1b);
		
		TextView TextViewQuestionK1c = new TextView(getActivity());
		TextViewQuestionK1c.setText("difficulté à uriner, ou urine >= 3x/nuit");
		lm.addView(TextViewQuestionK1c);
		
		Spinner spinnerQuestionK1c = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1c.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1c);
		
		TextView TextViewQuestionK1d = new TextView(getActivity());
		TextViewQuestionK1d.setText("perte d’appétit ");
		lm.addView(TextViewQuestionK1d);
		
		Spinner spinnerQuestionK1d = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1d.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1d);
		
		TextView TextViewQuestionK1e = new TextView(getActivity());
		TextViewQuestionK1e.setText("vomissements ");
		lm.addView(TextViewQuestionK1e);
		
		Spinner spinnerQuestionK1e = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1e.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1e);
		
		TextView TextViewQuestionK1f = new TextView(getActivity());
		TextViewQuestionK1f.setText("vertiges ou étourdissements ");
		lm.addView(TextViewQuestionK1f);
		
		Spinner spinnerQuestionK1f = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1f.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1f);
		
		TextView TextViewQuestionK1g = new TextView(getActivity());
		TextViewQuestionK1g.setText("œdème périphérique ");
		lm.addView(TextViewQuestionK1g);
		
		Spinner spinnerQuestionK1g = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1g.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1g);
		
		TextView TextViewQuestionK1h = new TextView(getActivity());
		TextViewQuestionK1h.setText("difficultés d’endormissement et à dormir de façon  continue - réveil trop précoce, anxiété, sommeil non  ré- parateur ");
		lm.addView(TextViewQuestionK1h);
		
		Spinner spinnerQuestionK1h = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1h.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1h);
		
		TextView TextViewQuestionK1i = new TextView(getActivity());
		TextViewQuestionK1i.setText("Trop de sommeil - sommeil excessif qui limite le fonctionnement normal de la personne  ");
		lm.addView(TextViewQuestionK1i);
		
		Spinner spinnerQuestionK1i = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1i.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1i);
		
		TextView TextViewQuestionK1j = new TextView(getActivity());
		TextViewQuestionK1j.setText("idées délirantes (qui influencent le comportement quotidien) ");
		lm.addView(TextViewQuestionK1j);
		
		Spinner spinnerQuestionK1j = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1j.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1j);
		
		TextView TextViewQuestionK1k = new TextView(getActivity());
		TextViewQuestionK1k.setText("hallucinations (qui influencent le comportement quotidien) ");
		lm.addView(TextViewQuestionK1k);
		
		Spinner spinnerQuestionK1k = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK1k.setAdapter(dataAdapterSpinnerQuestionK1);          
		lm.addView(spinnerQuestionK1k);
		
		TextView TextViewQuestionK2 = new TextView(getActivity());
		TextViewQuestionK2.setText("Dyspnée ");
		lm.addView(TextViewQuestionK2);
		
		Spinner spinnerQuestionK2 = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK2.setAdapter(dataAdapterSpinnerQuestionK2);          
		lm.addView(spinnerQuestionK2);
		
		TextView TextViewQuestionK3 = new TextView(getActivity());
		TextViewQuestionK3.setText("FATIGUE ");
		lm.addView(TextViewQuestionK3);
		
		Spinner spinnerQuestionK3 = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK3.setAdapter(dataAdapterSpinnerQuestionK3);          
		lm.addView(spinnerQuestionK3);
		
		TextView TextViewQuestionK4 = new TextView(getActivity());
		TextViewQuestionK4.setText("DOULEURS ");
		lm.addView(TextViewQuestionK4);
		
		TextView TextViewQuestionK4a = new TextView(getActivity());
		TextViewQuestionK4a.setText("a. FREQUENCE à laquelle la cliente se plaint ou manifeste  des signes de douleur au cours des 3 derniers jours ");
		lm.addView(TextViewQuestionK4a);
		
		Spinner spinnerQuestionK4a = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK4a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK4a.setAdapter(dataAdapterSpinnerQuestionK4a);          
		lm.addView(spinnerQuestionK4a);
		
		
		TextView TextViewQuestionK4b = new TextView(getActivity());
		TextViewQuestionK4b.setText("b. INTENSITE DE LA DOULEUR ");
		lm.addView(TextViewQuestionK4b);
		
		Spinner spinnerQuestionK4b = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK4b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK4b.setAdapter(dataAdapterSpinnerQuestionK4b);          
		lm.addView(spinnerQuestionK4b);
		
		TextView TextViewQuestionK4c = new TextView(getActivity());
		TextViewQuestionK4c.setText("c. CONTROLE DES DOULEURS – DU POINT DE VUE DE LA CLIENTE: LES DOULEURS SONT-ELLES MAITRISE PAR LES MEDICAMENTES? ");
		lm.addView(TextViewQuestionK4c);
		
		Spinner spinnerQuestionK4c = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK4c.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK4c.setAdapter(dataAdapterSpinnerQuestionK4c);          
		lm.addView(spinnerQuestionK4c);
		
		TextView TextViewQuestionKS5 = new TextView(getActivity());
		TextViewQuestionKS5.setText("CHUTES ");
		lm.addView(TextViewQuestionKS5);
		
		TextView TextViewQuestionK5 = new TextView(getActivity());
		TextViewQuestionK5.setText("La cliente a-t-elle chuté dans les 3 derniers mois (ou depuis la dernière évaluation si celle-ci est plus récente)  ");
		lm.addView(TextViewQuestionK5);
		
		Spinner spinnerQuestionK5 = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK5.setAdapter(dataAdapterSpinnerQuestionK5);          
		lm.addView(spinnerQuestionK5);
		
		TextView TextViewQuestionK6 = new TextView(getActivity());
		TextViewQuestionK6.setText("RISQUE DE CHUTES  ");
		lm.addView(TextViewQuestionK6);
		
		TextView TextViewQuestionK6a = new TextView(getActivity());
		TextViewQuestionK6a.setText("démarche instable ");
		lm.addView(TextViewQuestionK6a);
		
		Spinner spinnerQuestionK6a = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK6a.setAdapter(dataAdapterSpinnerQuestionK6);          
		lm.addView(spinnerQuestionK6a);
		
		TextView TextViewQuestionK6b = new TextView(getActivity());
		TextViewQuestionK6b.setText("la cliente restreint ses sorties à l’extérieur de peur de tomber ");
		lm.addView(TextViewQuestionK6b);
		
		Spinner spinnerQuestionK6b = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK6b.setAdapter(dataAdapterSpinnerQuestionK6);          
		lm.addView(spinnerQuestionK6b);
		
		TextView TextViewQuestionK7 = new TextView(getActivity());
		TextViewQuestionK7.setText("RISQUE DE CHUTES ");
		lm.addView(TextViewQuestionK7);
		
		TextView TextViewQuestionK7a = new TextView(getActivity());
		TextViewQuestionK7a.setText("a. dans les 3 DERNIERS MOIS, la cliente buvait un verre dès son réveil le matin ou a eu des problèmes liés à l’alcool?  ");
		lm.addView(TextViewQuestionK7a); 
		
		Spinner spinnerQuestionK7a = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK7a.setAdapter(dataAdapterSpinnerQuestionK7);          
		lm.addView(spinnerQuestionK7a);
		
		TextView TextViewQuestionK7b = new TextView(getActivity());
		TextViewQuestionK7b.setText("b. la cliente fume quotidiennement ");
		lm.addView(TextViewQuestionK7b); 
		
		Spinner spinnerQuestionK7b = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK7b.setAdapter(dataAdapterSpinnerQuestionK7);          
		lm.addView(spinnerQuestionK7b);
		
		TextView TextViewQuestionK8 = new TextView(getActivity());
		TextViewQuestionK8.setText("AUTRES INDICATEURS DE L’ETAT DE SANTE ");
		lm.addView(TextViewQuestionK8);
		
		TextView TextViewQuestionK8a = new TextView(getActivity());
		TextViewQuestionK8a.setText("a. hygiène déplorable inusitée ");
		lm.addView(TextViewQuestionK8a); 
		
		Spinner spinnerQuestionK8a = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK8a.setAdapter(dataAdapterSpinnerQuestionK8);          
		lm.addView(spinnerQuestionK8a);
		
		TextView TextViewQuestionK8b = new TextView(getActivity());
		TextViewQuestionK8b.setText("b. blessures inexpliquées (fractures, bleus) ");
		lm.addView(TextViewQuestionK8b); 
		
		Spinner spinnerQuestionK8b = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK8b.setAdapter(dataAdapterSpinnerQuestionK8);          
		lm.addView(spinnerQuestionK8b);
		
		TextView TextViewQuestionK8c = new TextView(getActivity());
		TextViewQuestionK8c.setText("c. contrainte physiquement (p.ex. immobilisé assis sur sa chaise, contention des membres, utilisation de bar- rières/barreaux de lit)");
		lm.addView(TextViewQuestionK8c); 
		
		Spinner spinnerQuestionK8c = new Spinner(getActivity());
		dataAdapterSpinnerQuestionK8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionK8c.setAdapter(dataAdapterSpinnerQuestionK8);          
		lm.addView(spinnerQuestionK8c);
		
		TextView TextViewQuestionSectionK = new TextView(getActivity());
		TextViewQuestionSectionK.setText("SECTION K. REMARQUES SUPPLEMENTAIRE");
		lm.addView(TextViewQuestionSectionK);
		
		EditText edittextSectionK = new EditText(getActivity());
		lm.addView(edittextSectionK);
	}
////////////////////////////End K  //////////////////////////
//////////////////////////// L  //////////////////////////

	if(itemPosition == 11)
	{
		lm.removeAllViews();
		
		TextView TextViewQuestionL1 = new TextView(getActivity());
		TextViewQuestionL1.setText("TAILLE ET POIDS");
		lm.addView(TextViewQuestionL1);
		
		TextView TextViewQuestionL1a = new TextView(getActivity());
		TextViewQuestionL1a.setText("a. taille (cm)");
		lm.addView(TextViewQuestionL1a);
		
		EditText edittextQuestionL1a = new EditText(getActivity());
		lm.addView(edittextQuestionL1a); 
		
		TextView TextViewQuestionL1b = new TextView(getActivity());
		TextViewQuestionL1b.setText("b. poids (kg)");
		lm.addView(TextViewQuestionL1b);
		
		EditText edittextQuestionL1b = new EditText(getActivity());
		lm.addView(edittextQuestionL1b);
		
		TextView TextViewQuestionL2 = new TextView(getActivity());
		TextViewQuestionL2.setText("PRISE DE LIQUIDE/NOURRITURE");
		lm.addView(TextViewQuestionL2);
		
		TextView TextViewQuestionL2a = new TextView(getActivity());
		TextViewQuestionL2a.setText("La cliente n’a pas pris ou a pris trop peu de liquides (< 1000 ml/jour) dans les 3 derniers jours");
		lm.addView(TextViewQuestionL2a);
		
		Spinner spinnerQuestionL2a = new Spinner(getActivity());
		dataAdapterSpinnerQuestionL2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionL2a.setAdapter(dataAdapterSpinnerQuestionL2);          
		lm.addView(spinnerQuestionL2a);
		
		
		TextView TextViewQuestionL2b = new TextView(getActivity());
		TextViewQuestionL2b.setText("La cliente n’a pas mangé de repas ou en a mangé seulement un au moins 2 jours dans les 3 derniers jours ");
		lm.addView(TextViewQuestionL2b);
		
		Spinner spinnerQuestionL2b = new Spinner(getActivity());
		dataAdapterSpinnerQuestionL2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionL2b.setAdapter(dataAdapterSpinnerQuestionL2);          
		lm.addView(spinnerQuestionL2b);
		
		TextView TextViewQuestionL3 = new TextView(getActivity());
		TextViewQuestionL3.setText("DÉGLUTITION ");
		lm.addView(TextViewQuestionL3);
		
		Spinner spinnerQuestionL3 = new Spinner(getActivity());
		dataAdapterSpinnerQuestionL3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionL3.setAdapter(dataAdapterSpinnerQuestionL3);          
		lm.addView(spinnerQuestionL3); 
		
		
		TextView TextViewQuestionL4 = new TextView(getActivity());
		TextViewQuestionL4.setText("REGIME DIETETIQUE ");
		lm.addView(TextViewQuestionL4);
		
		Spinner spinnerQuestionL4 = new Spinner(getActivity());
		dataAdapterSpinnerQuestionL4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionL4.setAdapter(dataAdapterSpinnerQuestionL4);          
		lm.addView(spinnerQuestionL4);
		
		TextView TextViewQuestionLS5 = new TextView(getActivity());
		TextViewQuestionLS5.setText("ETAT BUCCO-DENTAIRE");
		lm.addView(TextViewQuestionLS5);
		
		TextView TextViewQuestionL5 = new TextView(getActivity());
		TextViewQuestionL5.setText("problème quelconque de la bouche, des dents (douleur, bouche sèche, mastication difficile, dents cariées");
		lm.addView(TextViewQuestionL5);
		
		 
		Spinner spinnerQuestionL5 = new Spinner(getActivity());
		dataAdapterSpinnerQuestionL5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionL5.setAdapter(dataAdapterSpinnerQuestionL5);          
		lm.addView(spinnerQuestionL5);
		
		TextView TextViewQuestionLS6 = new TextView(getActivity());
		TextViewQuestionLS6.setText("PERTE DE POIDS");
		lm.addView(TextViewQuestionLS6);
		
		TextView TextViewQuestionL6 = new TextView(getActivity());
		TextViewQuestionL6.setText("perte de poids de 5% ou plus dans le dernier mois, ou de 10% ou plus dans les 6 derniers mois");
		lm.addView(TextViewQuestionL6);
		
		Spinner spinnerQuestionL6 = new Spinner(getActivity());
		dataAdapterSpinnerQuestionL6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerQuestionL6.setAdapter(dataAdapterSpinnerQuestionL6);          
		lm.addView(spinnerQuestionL6);
		
		TextView TextViewQuestionSectionL = new TextView(getActivity());
		TextViewQuestionSectionL.setText("SECTION L. REMARQUES SUPPLEMENTAIRE");
		lm.addView(TextViewQuestionSectionL);
		
		EditText edittextSectionL = new EditText(getActivity());
		lm.addView(edittextSectionL);
	}
////////////////////////////End L  //////////////////////////
	
//////////////////////////// M  //////////////////////////

				if(itemPosition == 12)
				{
				lm.removeAllViews();
				
				TextView TextViewQuestionMS1 = new TextView(getActivity());
				TextViewQuestionMS1.setText("PROBLEME DE PEAU ");
				lm.addView(TextViewQuestionMS1);
				
				TextView TextViewQuestionM1 = new TextView(getActivity());
				TextViewQuestionM1.setText("Tout problème ou changement de l’état de la peau? (es- carre, brûlures, lésions,  plaie, rougeur, démangeaisons, poux, gale, ...) ");
				lm.addView(TextViewQuestionM1);
				
				final Spinner spinnerQuestionM1 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionM1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionM1.setAdapter(dataAdapterSpinnerQuestionM1);          
				spinnerQuestionM1.setOnItemSelectedListener(new OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> arg0, View arg1,
                            int arg2, long arg3) {
                   if(spinnerQuestionM1.getSelectedItemId()== 1 )
                
                       {
                	   TextViewQuestionMS2.setVisibility(View.GONE);
                	   TextViewQuestionM2.setVisibility(View.GONE);
                	   spinnerQuestionM2.setVisibility(View.GONE);
                	   TextViewQuestionM3.setVisibility(View.GONE);
                	   TextViewQuestionM3a.setVisibility(View.GONE);
                	   spinnerQuestionM3a.setVisibility(View.GONE);
                	   TextViewQuestionM3b.setVisibility(View.GONE);
                	   spinnerQuestionM3b.setVisibility(View.GONE);
                	   TextViewQuestionM3c.setVisibility(View.GONE);
                	   spinnerQuestionM3c.setVisibility(View.GONE);
                	   TextViewQuestionM3d.setVisibility(View.GONE);
                	   spinnerQuestionM3d.setVisibility(View.GONE);
                       }
                   else 
                       {
                	   TextViewQuestionMS2.setVisibility(View.VISIBLE);
                	   TextViewQuestionM2.setVisibility(View.VISIBLE);
                	   spinnerQuestionM2.setVisibility(View.VISIBLE);
                	   TextViewQuestionM3.setVisibility(View.VISIBLE);
                	   TextViewQuestionM3a.setVisibility(View.VISIBLE);
                	   spinnerQuestionM3a.setVisibility(View.VISIBLE);
                	   TextViewQuestionM3b.setVisibility(View.VISIBLE);
                	   spinnerQuestionM3b.setVisibility(View.VISIBLE);
                	   TextViewQuestionM3c.setVisibility(View.VISIBLE);
                	   spinnerQuestionM3c.setVisibility(View.VISIBLE);
                	   TextViewQuestionM3d.setVisibility(View.VISIBLE);
                	   spinnerQuestionM3d.setVisibility(View.VISIBLE);
                       }
					}

					@Override
					public void onNothingSelected(AdapterView<?> arg0) {
						// TODO Auto-generated method stub
						
					}

                });
				lm.addView(spinnerQuestionM1);

			    TextViewQuestionMS2 = new TextView(getActivity());
				TextViewQuestionMS2.setText(" ESCARRES  ");
				lm.addView(TextViewQuestionMS2);
				
				 TextViewQuestionM2 = new TextView(getActivity());
				TextViewQuestionM2.setText("Présence d’une (plusieurs) escarre(s) n’importe où sur le corps. Codez le stade le plus avancé : ");
				lm.addView(TextViewQuestionM2);
				
			    spinnerQuestionM2 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionM2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionM2.setAdapter(dataAdapterSpinnerQuestionM2);          
				lm.addView(spinnerQuestionM2);
				
				
			    TextViewQuestionM3 = new TextView(getActivity());
				TextViewQuestionM3.setText(" AUTRES PROBLEMES DE LA PEAU ");
				lm.addView(TextViewQuestionM3);
				
			    TextViewQuestionM3a = new TextView(getActivity());
				TextViewQuestionM3a.setText("a. ulcère de stase (veineux), causé par une circulation veineuse réduite ");
				lm.addView(TextViewQuestionM3a);
					
			    spinnerQuestionM3a = new Spinner(getActivity());
				dataAdapterSpinnerQuestionM3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionM3a.setAdapter(dataAdapterSpinnerQuestionM3);          
				lm.addView(spinnerQuestionM3a);
				
			    TextViewQuestionM3b = new TextView(getActivity());
				TextViewQuestionM3b.setText("b. ulcère de stase (artériel), causé par une circulation artérielle réduite  ");
				lm.addView(TextViewQuestionM3b);
					
			    spinnerQuestionM3b = new Spinner(getActivity());
				dataAdapterSpinnerQuestionM3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionM3b.setAdapter(dataAdapterSpinnerQuestionM3);          
				lm.addView(spinnerQuestionM3b);
				
				
			    TextViewQuestionM3c = new TextView(getActivity());
				TextViewQuestionM3c.setText("c. autres lésions (plaies chirurgicales, brûlures 2-3e de- grés, coupures, déchirures)");
				lm.addView(TextViewQuestionM3c);
					
			    spinnerQuestionM3c = new Spinner(getActivity());
				dataAdapterSpinnerQuestionM3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionM3c.setAdapter(dataAdapterSpinnerQuestionM3);          
				lm.addView(spinnerQuestionM3c);
				
				
				TextViewQuestionM3d = new TextView(getActivity());
				TextViewQuestionM3d.setText("d. Autres problèmes cutanés (intertrigo, herpès, eczéma,  rougeurs, hématomes  p.ex.)");
				lm.addView(TextViewQuestionM3d);
					
				spinnerQuestionM3d = new Spinner(getActivity());
				dataAdapterSpinnerQuestionM3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionM3d.setAdapter(dataAdapterSpinnerQuestionM3);          
				lm.addView(spinnerQuestionM3d);
				
				
				TextView TextViewQuestionM4 = new TextView(getActivity());
				TextViewQuestionM4.setText("PROBLEME DES PIEDS ");
				lm.addView(TextViewQuestionM4);
				
				TextView TextViewQuestionMS4 = new TextView(getActivity());
				TextViewQuestionMS4.setText("Problèmes quelconques aux pieds (cors, déformations, dou- leurs, infections, p.ex.) ");
				lm.addView(TextViewQuestionMS4);
				
        				Spinner spinnerQuestionM4 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionM4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionM4.setAdapter(dataAdapterSpinnerQuestionM4);          
				lm.addView(spinnerQuestionM4);
				
				TextView TextViewQuestionSectionM = new TextView(getActivity());
				TextViewQuestionSectionM.setText("SECTION M. REMARQUES SUPPLEMENTAIRE");
				lm.addView(TextViewQuestionSectionM);
				
				EditText edittextSectionM = new EditText(getActivity());
				lm.addView(edittextSectionM);
				}
////////////////////////////End M  //////////////////////////
				
////////////////////////////N  //////////////////////////

				if(itemPosition == 13)
				{
				lm.removeAllViews();
				
				TextView TextViewQuestionNS1 = new TextView(getActivity());
				TextViewQuestionNS1.setText(" LOGEMENT HABITAT ");
				lm.addView(TextViewQuestionNS1);
				
				TextView TextViewQuestionN1 = new TextView(getActivity());
				TextViewQuestionN1.setText("Le logement de la cliente et ses alentours sont-ils inhabitables ou dangereux? (p.ex. : éclairage, chauffage, sols, tapis, salle de bain et WC,  cuisine, accessibilité du logement, des chambres");
				lm.addView(TextViewQuestionN1);
				
				Spinner spinnerQuestionN1 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionN1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionN1.setAdapter(dataAdapterSpinnerQuestionN1);          
				lm.addView(spinnerQuestionN1);
				
				TextView TextViewQuestionSectionN = new TextView(getActivity());
				TextViewQuestionSectionN.setText("SECTION N. REMARQUES SUPPLEMENTAIRE");
				lm.addView(TextViewQuestionSectionN);
				
				EditText edittextSectionN = new EditText(getActivity());
				lm.addView(edittextSectionN);
				}
////////////////////////////End N  //////////////////////////
				
////////////////////////////O  //////////////////////////

			if(itemPosition == 14)
			{
			lm.removeAllViews();
			
			TextView TextViewQuestionOS1 = new TextView(getActivity());
			TextViewQuestionOS1.setText(" SERVICES PROFESSIONNELS ");
			lm.addView(TextViewQuestionOS1);
			
			TextView TextViewQuestionO1 = new TextView(getActivity());
			TextViewQuestionO1.setText("Durant les 7 derniers jours, la cliente a-t-elle reçu à la mai- son les prestations d’un des professionnels suivants?");
			lm.addView(TextViewQuestionO1);
			
			TextView TextViewQuestionO1a = new TextView(getActivity());
			TextViewQuestionO1a.setText("a. aide familiale, aide soignante");
			lm.addView(TextViewQuestionO1a); 
			
			Spinner spinnerQuestionO1a = new Spinner(getActivity());
			dataAdapterSpinnerQuestionO1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionO1a.setAdapter(dataAdapterSpinnerQuestionO1);          
			lm.addView(spinnerQuestionO1a);
			
			TextView TextViewQuestionO1b = new TextView(getActivity());
			TextViewQuestionO1b.setText("b. infirmière ");
			lm.addView(TextViewQuestionO1b); 
			
			Spinner spinnerQuestionO1b = new Spinner(getActivity());
			dataAdapterSpinnerQuestionO1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionO1b.setAdapter(dataAdapterSpinnerQuestionO1);          
			lm.addView(spinnerQuestionO1b);
			
			TextView TextViewQuestionO1c = new TextView(getActivity());
			TextViewQuestionO1c.setText("c. aide ménagère");
			lm.addView(TextViewQuestionO1c); 
			
			Spinner spinnerQuestionO1c = new Spinner(getActivity());
			dataAdapterSpinnerQuestionO1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionO1c.setAdapter(dataAdapterSpinnerQuestionO1);          
			lm.addView(spinnerQuestionO1c);
			
			TextView TextViewQuestionO1d = new TextView(getActivity());
			TextViewQuestionO1d.setText("d. repas à domicile");
			lm.addView(TextViewQuestionO1d); 
			
			Spinner spinnerQuestionO1d = new Spinner(getActivity());
			dataAdapterSpinnerQuestionO1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionO1d.setAdapter(dataAdapterSpinnerQuestionO1);          
			lm.addView(spinnerQuestionO1d);
			
			TextView TextViewQuestionO1e = new TextView(getActivity());
			TextViewQuestionO1e.setText("e. bénévoles ");
			lm.addView(TextViewQuestionO1e); 
			
			Spinner spinnerQuestionO1e = new Spinner(getActivity());
			dataAdapterSpinnerQuestionO1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionO1e.setAdapter(dataAdapterSpinnerQuestionO1);          
			lm.addView(spinnerQuestionO1e);
			
			TextView TextViewQuestionO1f = new TextView(getActivity());
			TextViewQuestionO1f.setText("kiné (physio) – ergo - logothérapie ");
			lm.addView(TextViewQuestionO1f); 
			
			Spinner spinnerQuestionO1f = new Spinner(getActivity());
			dataAdapterSpinnerQuestionO1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionO1f.setAdapter(dataAdapterSpinnerQuestionO1);          
			lm.addView(spinnerQuestionO1f);
			
			TextView TextViewQuestionO1g = new TextView(getActivity());
			TextViewQuestionO1g.setText("centre ou hôpital ou foyer de jour");
			lm.addView(TextViewQuestionO1g); 
			
			Spinner spinnerQuestionO1g = new Spinner(getActivity());
			dataAdapterSpinnerQuestionO1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionO1g.setAdapter(dataAdapterSpinnerQuestionO1);          
			lm.addView(spinnerQuestionO1g);
			
			TextView TextViewQuestionO1h = new TextView(getActivity());
			TextViewQuestionO1h.setText("travailleur social ");
			lm.addView(TextViewQuestionO1h); 
			
			Spinner spinnerQuestionO1h = new Spinner(getActivity());
			dataAdapterSpinnerQuestionO1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionO1h.setAdapter(dataAdapterSpinnerQuestionO1);          
			lm.addView(spinnerQuestionO1h);
			
			TextView TextViewQuestionO1i = new TextView(getActivity());
			TextViewQuestionO1i.setText("autre");
			lm.addView(TextViewQuestionO1i); 
			
			EditText edittextQuestionO1i = new EditText(getActivity());
			lm.addView(edittextQuestionO1i);
					
			
			TextView TextViewQuestionOS2 = new TextView(getActivity());
			TextViewQuestionOS2.setText(" TRAITEMENT PRESCRIT  ");
			lm.addView(TextViewQuestionOS2);
			
			TextView TextViewQuestionO2 = new TextView(getActivity());
			TextViewQuestionO2.setText("Le médecin a-t-il prescrit des traitements? ");
			lm.addView(TextViewQuestionO2);
			
			Spinner spinnerQuestionO2 = new Spinner(getActivity());
			dataAdapterSpinnerQuestionO2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionO2.setAdapter(dataAdapterSpinnerQuestionO2);          
			lm.addView(spinnerQuestionO2);
			
			TextView TextViewQuestionSectionO = new TextView(getActivity());
			TextViewQuestionSectionO.setText("SECTION O. REMARQUES SUPPLEMENTAIRE");
			lm.addView(TextViewQuestionSectionO);
			
			EditText edittextSectionO = new EditText(getActivity());
			lm.addView(edittextSectionO);
			}
		////////////////////////////End O  //////////////////////////
						
//////////////////////////// P  //////////////////////////

			if(itemPosition == 15)
			{
			lm.removeAllViews();
			
			TextView TextViewQuestionPS1 = new TextView(getActivity());
			TextViewQuestionPS1.setText(" NOMBRE DE MEDICAMENTS ");
			lm.addView(TextViewQuestionPS1);
			
			TextView TextViewQuestionP1 = new TextView(getActivity());
			TextViewQuestionP1.setText("Nombre de médicaments (différents groupes de subs- tances), (médication prescrite ou prise par soi-même) qui ont été utilisés dans les 7 derniers jours. ");
			lm.addView(TextViewQuestionP1);
			
			EditText edittextQuestionP = new EditText(getActivity());
			
			edittextQuestionP.addTextChangedListener(new TextWatcher() {

			    public void onTextChanged(CharSequence s, int start, int before,
			            int count) {
			    	Log.e("aaaa  ",s.toString());
			    	if(s.toString().equals("0")) 
	                { 
			    		Log.e("okkkkk  ","okkkkk  ");
			    		   TextViewQuestionPS2.setVisibility(View.GONE);
			    		   TextViewQuestionP2a.setVisibility(View.GONE);
			    		   spinnerQuestionP2a.setVisibility(View.GONE);
			    		   TextViewQuestionP2b.setVisibility(View.GONE);
			    		   spinnerQuestionP2b.setVisibility(View.GONE);

			    		   TextViewQuestionP3.setVisibility(View.GONE);
			    		   spinnerQuestionP3.setVisibility(View.GONE);
			    		   TextViewQuestionP4.setVisibility(View.GONE);
			    		   spinnerQuestionP4.setVisibility(View.GONE);
			    		   TextViewQuestionP5.setVisibility(View.GONE);
			    		   TextViewQuestionP5a.setVisibility(View.GONE);
			    		   spinnerQuestionP5a.setVisibility(View.GONE);
			    		   TextViewQuestionP5b.setVisibility(View.GONE);
			    		   spinnerQuestionP5b.setVisibility(View.GONE);
			    		   TextViewQuestionP5c.setVisibility(View.GONE);
			    		   spinnerQuestionP5c.setVisibility(View.GONE);
			    		   TextViewQuestionP5d.setVisibility(View.GONE);
			    		   spinnerQuestionP5d.setVisibility(View.GONE);
			    		   TextViewQuestionP5e.setVisibility(View.GONE);
			    		   spinnerQuestionP5e.setVisibility(View.GONE);
			    		   TextViewQuestionP6.setVisibility(View.GONE);
			    		   spinnerQuestionP6.setVisibility(View.GONE);
			    		   TextViewQuestionP7.setVisibility(View.GONE);
			    		   spinnerQuestionP7.setVisibility(View.GONE);
	                 }
			    	else 
			    	{
			    		 TextViewQuestionPS2.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP2a.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP2a.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP2b.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP2b.setVisibility(View.VISIBLE);

			    		   TextViewQuestionP3.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP3.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP4.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP4.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP5.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP5a.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP5a.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP5b.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP5b.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP5c.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP5c.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP5d.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP5d.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP5e.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP5e.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP6.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP6.setVisibility(View.VISIBLE);
			    		   TextViewQuestionP7.setVisibility(View.VISIBLE);
			    		   spinnerQuestionP7.setVisibility(View.VISIBLE);
			    	}

			    }

			    public void beforeTextChanged(CharSequence s, int start, int count,
			            int after) {

			    }

			    public void afterTextChanged(Editable s) {
			    	
			    	

			    }
			});
			
			lm.addView(edittextQuestionP);
			
			

			
			 TextViewQuestionPS2 = new TextView(getActivity());
			TextViewQuestionPS2.setText("PRÉPARATION ");
			lm.addView(TextViewQuestionPS2);
			
			 TextViewQuestionP2a = new TextView(getActivity());
			TextViewQuestionP2a.setText("a. Qui a la charge de préparer les médicaments?  ");
			lm.addView(TextViewQuestionP2a);
			
			 spinnerQuestionP2a = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP2a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP2a.setAdapter(dataAdapterSpinnerQuestionP2a);          
			lm.addView(spinnerQuestionP2a);
			
			 TextViewQuestionP2b = new TextView(getActivity());
			TextViewQuestionP2b.setText("b. Si 2a=1: Combien de fois le SAD prépare t-il les médicaments? ");
			lm.addView(TextViewQuestionP2b);
			
			 spinnerQuestionP2b = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP2b.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP2b.setAdapter(dataAdapterSpinnerQuestionP2b);          
			lm.addView(spinnerQuestionP2b);
			
			
			 TextViewQuestionP3 = new TextView(getActivity());
			TextViewQuestionP3.setText(" LISTE DES MEDICAMENTS ");
			lm.addView(TextViewQuestionP3);
			
			 spinnerQuestionP3 = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP3.setAdapter(dataAdapterSpinnerQuestionP3);          
			lm.addView(spinnerQuestionP3);
			
			 TextViewQuestionP4 = new TextView(getActivity());
			TextViewQuestionP4.setText(" MEDICAMENTS-INCOMPATIBILITES ");
			lm.addView(TextViewQuestionP4);
			
			 spinnerQuestionP4 = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP4.setAdapter(dataAdapterSpinnerQuestionP4);          
			lm.addView(spinnerQuestionP4);
			
			 TextViewQuestionP5 = new TextView(getActivity());
			TextViewQuestionP5.setText("MÉDICAMENTS PSYCHOTROPES ET ANALGÉSIQUES – pris durant les 7 derniers jours");
			lm.addView(TextViewQuestionP5);
			
			 TextViewQuestionP5a = new TextView(getActivity());
			TextViewQuestionP5a.setText("antipsychotique (neuroleptiques)");
			lm.addView(TextViewQuestionP5a);
			
			 spinnerQuestionP5a = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP5a.setAdapter(dataAdapterSpinnerQuestionP5);          
			lm.addView(spinnerQuestionP5a);
			
			 TextViewQuestionP5b = new TextView(getActivity());
			TextViewQuestionP5b.setText("anxiolytiques");
			lm.addView(TextViewQuestionP5b);
			
			 spinnerQuestionP5b = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP5b.setAdapter(dataAdapterSpinnerQuestionP5);          
			lm.addView(spinnerQuestionP5b);
			
			
			 TextViewQuestionP5c = new TextView(getActivity());
			TextViewQuestionP5c.setText("antidépresseurs");
			lm.addView(TextViewQuestionP5c);
			
			 spinnerQuestionP5c = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP5c.setAdapter(dataAdapterSpinnerQuestionP5);          
			lm.addView(spinnerQuestionP5c);
			
			 TextViewQuestionP5d = new TextView(getActivity());
			TextViewQuestionP5d.setText("hypnotiques");
			lm.addView(TextViewQuestionP5d);
			
			 spinnerQuestionP5d = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP5d.setAdapter(dataAdapterSpinnerQuestionP5);          
			lm.addView(spinnerQuestionP5d);
			
			 TextViewQuestionP5e = new TextView(getActivity());
			TextViewQuestionP5e.setText("analgésiques");
			lm.addView(TextViewQuestionP5e);
			
			 spinnerQuestionP5e = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP5e.setAdapter(dataAdapterSpinnerQuestionP5);          
			lm.addView(spinnerQuestionP5e);
			 
			
			 TextViewQuestionP6 = new TextView(getActivity());
			TextViewQuestionP6.setText("FIABILITE OBSERVANCE – Durant les 7 derniers jours, la cliente a-t-elle pris ses médicaments comme prescrits par le médecin (y.c. les jours où le service n’intervient pas");
			lm.addView(TextViewQuestionP6);
			
			 spinnerQuestionP6 = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP6.setAdapter(dataAdapterSpinnerQuestionP6);          
			lm.addView(spinnerQuestionP6);
			
			 TextViewQuestionP7 = new TextView(getActivity());
			TextViewQuestionP7.setText("SUIVI MÉDICAL DES MÉDICAMENTS");
			lm.addView(TextViewQuestionP7);
			
			 spinnerQuestionP7 = new Spinner(getActivity());
			dataAdapterSpinnerQuestionP7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinnerQuestionP7.setAdapter(dataAdapterSpinnerQuestionP7);          
			lm.addView(spinnerQuestionP7);
			
			
			TextView TextViewQuestionSectionP = new TextView(getActivity());
			TextViewQuestionSectionP.setText("SECTION P. REMARQUES SUPPLEMENTAIRE");
			lm.addView(TextViewQuestionSectionP);
			
			EditText edittextSectionP = new EditText(getActivity());
			lm.addView(edittextSectionP);
					}
////////////////////////////End P  //////////////////////////	
				
//////////////////////////// Q  //////////////////////////

				if(itemPosition == 16)
				{
				lm.removeAllViews();
				
				TextView TextViewQuestionQ1 = new TextView(getActivity());
				TextViewQuestionQ1.setText("ETAT DE SANTE – Si on le lui demande, la cliente dit qu’elle se sent en mauvaise santé. ");
				lm.addView(TextViewQuestionQ1);
				
				Spinner spinnerQuestionQ1 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionQ1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionQ1.setAdapter(dataAdapterSpinnerQuestionQ1);          
				lm.addView(spinnerQuestionQ1);
				
				TextView TextViewQuestionQS2 = new TextView(getActivity());
				TextViewQuestionQS2.setText(" CHANGEMENT GLOBAL DU DEGRÉ D’INDÉPENDANCE  (ne remplir que lors d’une  réévaluation)  ");
				lm.addView(TextViewQuestionQS2);
				
				TextView TextViewQuestionQ2 = new TextView(getActivity());
				TextViewQuestionQ2.setText("L’autonomie de la cliente a-t-elle changé par rapport il y a 3 mois (ou depuis la dernière évaluation si celle-ci est plus ré- cente)? ");
				lm.addView(TextViewQuestionQ2);
				
				Spinner spinnerQuestionQ2 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionQ2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionQ2.setAdapter(dataAdapterSpinnerQuestionQ2);          
				lm.addView(spinnerQuestionQ2);
				
				TextView TextViewQuestionQS3 = new TextView(getActivity());
				TextViewQuestionQS3.setText(" ATTEINTE d’objectifs (ne remplir que lors d’une  réévaluation) ");
				lm.addView(TextViewQuestionQS3);
				
				TextView TextViewQuestionQ3 = new TextView(getActivity());
				TextViewQuestionQ3.setText("Un  ou plusieurs objectifs de soins ont-ils été atteints dans les 90 derniers jours (ou depuis la dernière évaluation)?");
				lm.addView(TextViewQuestionQ3);
				
				Spinner spinnerQuestionQ3 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionQ3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionQ3.setAdapter(dataAdapterSpinnerQuestionQ3);          
				lm.addView(spinnerQuestionQ3);
				
				TextView TextViewQuestionSectionQ = new TextView(getActivity());
				TextViewQuestionSectionQ.setText("SECTION Q. REMARQUES SUPPLEMENTAIRE");
				lm.addView(TextViewQuestionSectionQ);
				
				EditText edittextSectionQ = new EditText(getActivity());
				lm.addView(edittextSectionQ);
						}
	////////////////////////////End Q  //////////////////////////	
				
//////////////////////////// R  //////////////////////////

				if(itemPosition == 17)
				{
				lm.removeAllViews();
				
				TextView TextViewQuestionRS1 = new TextView(getActivity());
				TextViewQuestionRS1.setText("RESPONSABILITES ");
				lm.addView(TextViewQuestionRS1);
				
				TextView TextViewQuestionR1 = new TextView(getActivity());
				TextViewQuestionR1.setText("Le client a un représentant légal (tuteur, curateur)  ");
				lm.addView(TextViewQuestionR1);
				
				Spinner spinnerQuestionR1 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionR1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionR1.setAdapter(dataAdapterSpinnerQuestionR1);          
				lm.addView(spinnerQuestionR1);
				
				TextView TextViewQuestionRS2 = new TextView(getActivity());
				TextViewQuestionRS2.setText("DIRECTIVES ANTICIPEES ");
				lm.addView(TextViewQuestionRS2);
				
				TextView TextViewQuestionR2 = new TextView(getActivity());
				TextViewQuestionR2.setText("Le client a exprimé des volontés pour l’avenir (p.ex. : ne veut pas être hospitalisé, ou placé en institution) ");
				lm.addView(TextViewQuestionR2);
				
				Spinner spinnerQuestionR2 = new Spinner(getActivity());
				dataAdapterSpinnerQuestionR2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinnerQuestionR2.setAdapter(dataAdapterSpinnerQuestionR2);          
				lm.addView(spinnerQuestionR2);
				
				TextView TextViewQuestionSectionR = new TextView(getActivity());
				TextViewQuestionSectionR.setText("SECTION R. REMARQUES SUPPLEMENTAIRE");
				lm.addView(TextViewQuestionSectionR);
				
				EditText edittextSectionR = new EditText(getActivity());
				lm.addView(edittextSectionR);
						}
////////////////////////////End R  //////////////////////////	
				
//////////////////////////// S  //////////////////////////

					if(itemPosition == 18)
					{
					 lm.removeAllViews();
					 
					 TextView TextViewQuestionDate1 = new TextView(getActivity());
					 TextViewQuestionDate1.setText("Date à laquelle la évaluatrice atteste que l’évaluation et terminée  ");
				    lm.addView(TextViewQuestionDate1);
						
					 ImageButton imageDatePickerQuestionDate1 = new ImageButton(getActivity());
					 imageDatePickerQuestionDate1.setImageResource(R.drawable.calendar_icon);
             
                     final EditText edittextQuestionDate1 = new EditText(getActivity());
                     edittextQuestionDate1.setEnabled(false);
                    lm.addView(edittextQuestionDate1);
                      
                    imageDatePickerQuestionDate1.setOnClickListener(new OnClickListener() {
                             public void onClick(View v) {
                                  
                                 Log.i("TAG", "index :");
                                  
                                 Toast.makeText(getActivity().getApplicationContext(), 
                                         "Clicked Button Index :", 
                                         Toast.LENGTH_LONG).show();
                                 DialogFragment newFragmentDialogDate = new DatePickerFragment(){
                 	                @Override
                 	                public void onDateSet(DatePicker view, int year, int month, int day) {
                 	                	Date d = new Date(year, month, day);
                 	                	edittextQuestionDate1.setText(d.toString());
                 	                }
                 	             };;
                 	            newFragmentDialogDate.show(getFragmentManager(), "timePicker");
                         
                             }
                         });
                          
              
                        //Add button to LinearLayout defined in XML
                         lm.addView(imageDatePickerQuestionDate1);  
                         
                         
                         TextView TextViewQuestionSignature1 = new TextView(getActivity());
                         TextViewQuestionSignature1.setText("Signature de la personne  ayant clôturé le MDS-HC ");
    				     lm.addView(TextViewQuestionSignature1);
    				     
    		              EditText edittextSectionSignature = new EditText(getActivity());
    		              lm.addView(edittextSectionSignature);
    		              
	              
    		              TextView TextViewQuestionDate2 = new TextView(getActivity());
    		              TextViewQuestionDate2.setText("Date");
    					    lm.addView(TextViewQuestionDate2);
    							
    						 ImageButton imageDatePickerQuestionDate2 = new ImageButton(getActivity());
    						 imageDatePickerQuestionDate2.setImageResource(R.drawable.calendar_icon);
    	             
    	                     final EditText edittextQuestionDate2 = new EditText(getActivity());
    	                     edittextQuestionDate2.setEnabled(false);
    	                    lm.addView(edittextQuestionDate2);
    	                      
    	                    imageDatePickerQuestionDate2.setOnClickListener(new OnClickListener() {
    	                             public void onClick(View v) {
    	                                  
    	                                 Log.i("TAG", "index :");
    	                                  
    	                                 Toast.makeText(getActivity().getApplicationContext(), 
    	                                         "Clicked Button Index :", 
    	                                         Toast.LENGTH_LONG).show();
    	                                 DialogFragment newFragmentDialogDate2 = new DatePickerFragment(){
    	                 	                @Override
    	                 	                public void onDateSet(DatePicker view, int year, int month, int day) {
    	                 	                	Date d = new Date(year, month, day);
    	                 	                	edittextQuestionDate2.setText(d.toString());
    	                 	                }
    	                 	             };;
    	                 	            newFragmentDialogDate2.show(getFragmentManager(), "timePicker");
    	                         
    	                             }
    	                         });
    	                          
    	              
    	                        //Add button to LinearLayout defined in XML
    	                         lm.addView(imageDatePickerQuestionDate2);      	                            	                    
    	                        
    	                         TextView TextViewQuestionSignature2 = new TextView(getActivity());
    	                         TextViewQuestionSignature2.setText("Signature de la responsable du MDS-HC");
    	    				     lm.addView(TextViewQuestionSignature2);
    	    				     
    	    		             EditText edittextSectionSignature2 = new EditText(getActivity());
    	    		             lm.addView(edittextSectionSignature2);
    	    		             
    	    		             TextView TextViewQuestionFonction1 = new TextView(getActivity());
    	    		             TextViewQuestionFonction1.setText("Fonction");
    	    				     lm.addView(TextViewQuestionFonction1);
    	    				     
    	    		             EditText edittextSectionFonction1 = new EditText(getActivity());
    	    		             lm.addView(edittextSectionFonction1);
    	    		             
    	    
    	    		             TextView TextViewQuestionDate3 = new TextView(getActivity());
    	    		             TextViewQuestionDate3.setText("Date");
    	    					    lm.addView(TextViewQuestionDate3);
    	    							
    	    						 ImageButton imageDatePickerQuestionDate3 = new ImageButton(getActivity());
    	    						 imageDatePickerQuestionDate3.setImageResource(R.drawable.calendar_icon);
    	    	             
    	    	                     final EditText edittextQuestionDate3 = new EditText(getActivity());
    	    	                     edittextQuestionDate3.setEnabled(false);
    	    	                    lm.addView(edittextQuestionDate3);
    	    	                      
    	    	                    imageDatePickerQuestionDate3.setOnClickListener(new OnClickListener() {
    	    	                             public void onClick(View v) {
    	    	                                  
    	    	                                 Log.i("TAG", "index :");
    	    	                                  
    	    	                                 Toast.makeText(getActivity().getApplicationContext(), 
    	    	                                         "Clicked Button Index :", 
    	    	                                         Toast.LENGTH_LONG).show();
    	    	                                 DialogFragment newFragmentDialogDate3 = new DatePickerFragment(){
    	    	                 	                @Override
    	    	                 	                public void onDateSet(DatePicker view, int year, int month, int day) {
    	    	                 	                	Date d = new Date(year, month, day);
    	    	                 	                	edittextQuestionDate3.setText(d.toString());
    	    	                 	                }
    	    	                 	             };;
    	    	                 	            newFragmentDialogDate3.show(getFragmentManager(), "timePicker");
    	    	                         
    	    	                             }
    	    	                         });
    	    	                          
    	    	              
    	    	                        //Add button to LinearLayout defined in XML
    	    	                         lm.addView(imageDatePickerQuestionDate3);      	                            	                    
    	    	                        
    	    	                         TextView TextViewQuestionSignature3 = new TextView(getActivity());
    	    	                         TextViewQuestionSignature3.setText("Signature");
    	    	    				     lm.addView(TextViewQuestionSignature3);
    	    	    				     
    	    	    		             EditText edittextSectionSignature3 = new EditText(getActivity());
    	    	    		             lm.addView(edittextSectionSignature3);
    	    	    		             
    	    	    		             TextView TextViewQuestionFonction2 = new TextView(getActivity());
    	    	    		             TextViewQuestionFonction2.setText("Fonction");
    	    	    				     lm.addView(TextViewQuestionFonction2);
    	    	    				     
    	    	    		             EditText edittextSectionFonction2 = new EditText(getActivity());
    	    	    		             lm.addView(edittextSectionFonction2);

					}
////////////////////////////End S  //////////////////////////	
 			}
 		});
      

      
		return rootView;
	}

}
