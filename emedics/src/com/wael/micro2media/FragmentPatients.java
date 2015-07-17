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
import android.text.InputType;
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

public class FragmentPatients extends Fragment {
	private ListView listView;
	private Calendar cal;
	private int day;
	private int month;
	private int year;
	View rootView;
	private ArrayAdapter<String> dataAdapterSpinnerQuestion2;
	private ArrayAdapter<String> dataAdapterSpinnerQuestion3a;
	private ArrayAdapter<String> dataAdapterSpinnerQuestion3b;
	private ArrayAdapter<String> dataAdapterSpinnerQuestion3c;
	private ArrayAdapter<String> dataAdapterSpinnerQuestionB1, dataAdapterSpinnerSexe, dataAdapterSpinnerNationa, dataAdapterSpinnerEtatcivil, dataAdapterSpinnerLanguematernelle;
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
	private Spinner spinnerQuestionB3a;
	private TextView TextViewQuestionB3b;
	private Spinner spinnerQuestionB3b;
	private TextView TextViewQuestionB3c;
	private Spinner spinnerQuestionB3c;
	private TextView TextViewQuestionB4;
	private Spinner spinnerQuestionB4;
	private TextView TextViewQuestionB5;
	private Spinner spinnerQuestionB5;
	private TextView TextViewQuestionG2;
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
	private TextView TextViewQuestionMS2;
	private TextView TextViewQuestionM2;
	private Spinner spinnerQuestionM2;
	private TextView TextViewQuestionM3;
	private TextView TextViewQuestionM3a;
	private Spinner spinnerQuestionM3a;
	private TextView TextViewQuestionM3b;
	private Spinner spinnerQuestionM3b;
	private TextView TextViewQuestionM3c;
	private Spinner spinnerQuestionM3c;
	private TextView TextViewQuestionM3d;
	private Spinner spinnerQuestionM3d;

	private TextView TextViewQuestionPS2;
	private TextView TextViewQuestionP2a;
	private Spinner spinnerQuestionP2a;
	private TextView TextViewQuestionP2b;
	private Spinner spinnerQuestionP2b;

	private TextView TextViewQuestionP3;
	private Spinner spinnerQuestionP3;
	private TextView TextViewQuestionP4;
	private Spinner spinnerQuestionP4;
	private TextView TextViewQuestionP5;
	private TextView TextViewQuestionP5a;
	private Spinner spinnerQuestionP5a;
	private TextView TextViewQuestionP5b;
	private Spinner spinnerQuestionP5b;
	private TextView TextViewQuestionP5c;
	private Spinner spinnerQuestionP5c;
	private TextView TextViewQuestionP5d;
	private Spinner spinnerQuestionP5d;
	private TextView TextViewQuestionP5e;
	private Spinner spinnerQuestionP5e;
	private TextView TextViewQuestionP6;
	private Spinner spinnerQuestionP6;
	private TextView TextViewQuestionP7;
	private Spinner spinnerQuestionP7;

	FragmentPatients() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		rootView = inflater.inflate(layout.fragment_patients, container, false);
		// Get ListView object from xml
		listView = (ListView) rootView.findViewById(id.myListView);

		cal = Calendar.getInstance();
		day = cal.get(Calendar.DAY_OF_MONTH);
		month = cal.get(Calendar.MONTH);
		year = cal.get(Calendar.YEAR);
		// Defined Array values to show in ListView
		String[] values = new String[] {
				"AA. DATE ET NOM DE LA PERSONNE QUI ADRESSE LA DEMANDE (si autre que la cliente)",
				"BB. NOM ET IDENTIFICATION DE LA CLIENTE",
				"CC. PERSONNES DE CONTACT", "DD. CONTENU DE LA DEMANDE",
				"EE. SITUATION DE LA CLIENTE", "FF. DECISION ET TRANSMISSION",
				"GG. DATE ET SIGNATURES", };

		// Define a new Adapter
		// First parameter - Context
		// Second parameter - Layout for the row
		// Third parameter - ID of the TextView to which the data is written
		// Forth - the Array of data

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				this.getActivity(), android.R.layout.simple_list_item_1,
				android.R.id.text1, values);

		List<String> listSpinnerQuestion2 = new ArrayList<String>();
		listSpinnerQuestion2.add("premi�re �valuation, � l�admission");
		listSpinnerQuestion2.add("r��valuation (�valuation de suivi)");
		listSpinnerQuestion2.add("changement de l��tat de la cliente");
		listSpinnerQuestion2.add("correction");
		listSpinnerQuestion2.add("autre");

		dataAdapterSpinnerQuestion2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestion2);

		List<String> listSpinnerQuestion3a = new ArrayList<String>();
		listSpinnerQuestion3a.add("seule");
		listSpinnerQuestion3a.add("avec conjoint");
		listSpinnerQuestion3a
				.add("avec conjoint et autres (enfants, parents, amis)");
		listSpinnerQuestion3a.add("avec enfants, sans conjoint");
		listSpinnerQuestion3a.add("avec autre membre de sa parent�");
		listSpinnerQuestion3a.add("vit en groupe avec des non-parents");

		dataAdapterSpinnerQuestion3a = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestion3a);

		List<String> listSpinnerQuestion3b = new ArrayList<String>();
		listSpinnerQuestion3b
				.add("Domicile priv�/appartement/appartement pour personnes �g�es (sans pr�c�dente intervention du centre d�aide et de soins � domicile)");
		listSpinnerQuestion3b
				.add("Domicile priv�/appartement/appartement pour personnes �g�es (avec pr�c�dente intervention du centre d�aide et de soins � domicile)");
		listSpinnerQuestion3b
				.add("logements encadr�s avec prestations de service");
		listSpinnerQuestion3b.add("maison de retraite m�dicalis�e");
		listSpinnerQuestion3b.add("autre endroit");

		dataAdapterSpinnerQuestion3b = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestion3b);

		List<String> listSpinnerQuestion3c = new ArrayList<String>();
		listSpinnerQuestion3c
				.add("Non, pas de s�jour � l�h�pital dans les 90 derniers jours");
		listSpinnerQuestion3c
				.add("Oui, sortie au cours des 31-90 derniers jours");
		listSpinnerQuestion3c
				.add("Oui, sortie au cours des 8-30 derniers jours");
		listSpinnerQuestion3c.add("Oui, sortie au cours des 7derniers jours");

		dataAdapterSpinnerQuestion3c = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestion3c);

		List<String> listSpinnerQuestionB1 = new ArrayList<String>();
		listSpinnerQuestionB1.add("0 = non");
		listSpinnerQuestionB1.add("1 = oui");
		listSpinnerQuestionB1.add("2 = a fait la demande");
		
		List<String> listSpinnerQuestionSexe = new ArrayList<String>();
		listSpinnerQuestionSexe.add("1 = masculin");
		listSpinnerQuestionSexe.add("2 = f�minin");
		
		List<String> listSpinnerQuestionNationa = new ArrayList<String>();
		listSpinnerQuestionNationa.add("1 = suisse");
		listSpinnerQuestionNationa.add("2 = autre");
		
		List<String> listSpinnerQuestionLanguematernelle = new ArrayList<String>();
		listSpinnerQuestionLanguematernelle.add("1 = langue parl�e localement");
		listSpinnerQuestionLanguematernelle.add("2 = autre");
		
		List<String> listSpinnerQuestionEtatcivil = new ArrayList<String>();
		listSpinnerQuestionEtatcivil.add("1 = c�libataire");
		listSpinnerQuestionEtatcivil.add("2 = mari�e");
		listSpinnerQuestionEtatcivil.add("3 = veuve");
		listSpinnerQuestionEtatcivil.add("4 = s�par�e");
		listSpinnerQuestionEtatcivil.add("5 = divorc�e");
		listSpinnerQuestionEtatcivil.add("6 = autre");
		
		dataAdapterSpinnerQuestionB1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionB1);
		dataAdapterSpinnerSexe = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionSexe);
		dataAdapterSpinnerNationa = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionNationa);
		
		dataAdapterSpinnerEtatcivil = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionEtatcivil);
		
		dataAdapterSpinnerLanguematernelle = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionLanguematernelle);
		
		List<String> listSpinnerQuestionB2 = new ArrayList<String>();
		listSpinnerQuestionB2
				.add("INDEPENDANTE - d�cisions logiques, raisonnables et s�res");
		listSpinnerQuestionB2
				.add("INDEPENDANCE ALTEREE - Quelques difficult�s dans situa- tions nouvelles uniquement");
		listSpinnerQuestionB2
				.add("LEGEREMENT DEFICIENTE - dans situations particuli�res, d�ci- sions pauvres ou risqu�es,  a besoin d�indications ou  de surveillance");
		listSpinnerQuestionB2
				.add("MOYENNEMENT DEFICIENTE - D�cisions presque toujours  pauvres ou risqu�es ; a besoin d�indications/surveillance  continue");
		listSpinnerQuestionB2
				.add("GRAVEMENT DEFICIENTE - Ne prend pratiquement jamais de  d�cisions");

		dataAdapterSpinnerQuestionB2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionB2);

		List<String> listSpinnerQuestionB3 = new ArrayList<String>();
		listSpinnerQuestionB3.add("comportement pas observ�");
		listSpinnerQuestionB3
				.add("comportement observ�, mais n�est pas  nouveau (comportement habituel)");
		listSpinnerQuestionB3
				.add("comportement observ�, mais qui diff�re du comportement  habituel (p.ex. comportement nouveau ou d�t�rioration)");

		dataAdapterSpinnerQuestionB3 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionB3);

		List<String> listSpinnerQuestionB4 = new ArrayList<String>();
		listSpinnerQuestionB4.add("Oui");
		listSpinnerQuestionB4.add("Non");

		dataAdapterSpinnerQuestionB4 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionB4);

		List<String> listSpinnerQuestionB5 = new ArrayList<String>();
		listSpinnerQuestionB5.add("Am�lior�");
		listSpinnerQuestionB5.add("D�t�rior�");
		listSpinnerQuestionB5.add("Pas de modification");
		listSpinnerQuestionB5.add("Ambigu");

		dataAdapterSpinnerQuestionB5 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionB5);

		List<String> listSpinnerQuestionC1 = new ArrayList<String>();
		listSpinnerQuestionC1.add("EST COMPRISE");
		listSpinnerQuestionC1
				.add("EST GENERALEMENT COMPRISE � difficult�s � trouver ses mots et aller au bout de sa pens�e ; mais si on laisse du temps, peu ou pas d�aide requise");
		listSpinnerQuestionC1
				.add("EST SOUVENT COMPRISE� difficult� � trouver les mots et aller au bout de la pens�e ; aide en g�n�ral n�cessaire");
		listSpinnerQuestionC1
				.add("EST PARFOIS COMPRISE � capacit� limit�e � l�expression de demandes concr�tes");
		listSpinnerQuestionC1.add("RAREMENT OU JAMAIS COMPRISE");

		dataAdapterSpinnerQuestionC1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionC1);

		List<String> listSpinnerQuestionC2 = new ArrayList<String>();
		listSpinnerQuestionC2.add("COMPREND");
		listSpinnerQuestionC2
				.add("COMPREND SOUVENT - PAS TOUJOURS TOUTE LA SIGNIFICATION DE L�INFORMATION");
		listSpinnerQuestionC2
				.add("COMPREND PARFOIS - UNIQUEMENT DES DIRECTIVES ET DES QUESTIONS SIMPLES");
		listSpinnerQuestionC2.add("COMPREND RAREMENT OU JAMAIS");

		dataAdapterSpinnerQuestionC2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionC2);

		List<String> listSpinnerQuestionC3 = new ArrayList<String>();
		listSpinnerQuestionC3
				.add("ENTEND BIEN � (conversation, T.V., t�l�phone, sonnette)");
		listSpinnerQuestionC3
				.add("DIFFICULTES MINIMES � dans un environnement bruyant");
		listSpinnerQuestionC3
				.add("N�ENTEND QUE DANS DES SITUATIONS PARTICULIERES. L�interlocuteur doit modifier le ton et articuler");
		listSpinnerQuestionC3
				.add("ATTEINTE GRAVE � n�entend pratiquement rien");

		dataAdapterSpinnerQuestionC3 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionC3);

		List<String> listSpinnerQuestionD1 = new ArrayList<String>();
		listSpinnerQuestionD1
				.add("BONNE. Distingue les d�tails, y compris les caract�res ordi- naires des journaux/livres");
		listSpinnerQuestionD1
				.add("LEGEREMENT DEFICIENTE. Ne lit que les gros caract�res des journaux/livres");
		listSpinnerQuestionD1
				.add("MOYENNEMENT DEFICIENTE. Vision limit�e, ne lit pas les titres des journaux mais reconna�t les objets");
		listSpinnerQuestionD1
				.add("TRES DEFICIENTE. Semble suivre les objets des yeux, mais on ne sait pas si elle les reconna�t");
		listSpinnerQuestionD1
				.add("GRAVEMENT ATTEINTE. Ne voit rien ou ne distingue que la lumi�re, les couleurs ou les formes. Ne suit pas les objets des yeux");

		dataAdapterSpinnerQuestionD1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionD1);

		List<String> listSpinnerQuestionE1 = new ArrayList<String>();
		listSpinnerQuestionE1.add("pas manifest�s dans les 3 derniers jours");
		listSpinnerQuestionE1
				.add("manifest�s, mais pas dans les 3 derniers jours");
		listSpinnerQuestionE1.add("manifest�s dans les 3 derniers jours");
		listSpinnerQuestionE1.add("la cliente ne r�pond pas");

		dataAdapterSpinnerQuestionE1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionE1);

		List<String> listSpinnerQuestionE2 = new ArrayList<String>();
		listSpinnerQuestionE2.add("non manifest� dans les 3 derniers jours ");
		listSpinnerQuestionE2.add("manifest�, mais facilement ma�tris� ");
		listSpinnerQuestionE2.add(" manifest� et difficilement ma�tris�");
		listSpinnerQuestionE2.add("la cliente ne r�pond pas");

		dataAdapterSpinnerQuestionE2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionE2);

		List<String> listSpinnerQuestionF1 = new ArrayList<String>();
		listSpinnerQuestionF1.add("dans les 7 derniers jours");
		listSpinnerQuestionF1.add("dans le dernier mois ");
		listSpinnerQuestionF1.add("auparavant ou pas du tout ");
		listSpinnerQuestionF1.add("la cliente ne r�pond pas ");

		dataAdapterSpinnerQuestionF1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionF1);

		List<String> listSpinnerQuestionF2 = new ArrayList<String>();
		listSpinnerQuestionF2.add("pas de diminution des activit�s sociales");
		listSpinnerQuestionF2.add("diminution, la cliente n�en souffre pas");
		listSpinnerQuestionF2.add("diminution, la cliente en souffre");
		listSpinnerQuestionF2.add("la cliente ne r�pond pas");
		listSpinnerQuestionF2
				.add("GRAVEMENT ATTEINTE. Ne voit rien ou ne distingue que la lumi�re, les couleurs ou les formes. Ne suit pas les objets des yeux");

		dataAdapterSpinnerQuestionF2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionF2);

		List<String> listSpinnerQuestionF3AndF4 = new ArrayList<String>();
		listSpinnerQuestionF3AndF4.add("non");
		listSpinnerQuestionF3AndF4.add("oui");
		listSpinnerQuestionF3AndF4.add("la cliente ne r�pond pas");

		dataAdapterSpinnerQuestionF3AndF4 = new ArrayAdapter<String>(
				getActivity(), android.R.layout.simple_spinner_item,
				listSpinnerQuestionF3AndF4);

		List<String> listSpinnerQuestionG1 = new ArrayList<String>();
		listSpinnerQuestionG1.add("aucun aidant");
		listSpinnerQuestionG1.add("un ou plusieurs aidants");

		dataAdapterSpinnerQuestionG1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionG1);

		List<String> listSpinnerQuestionG2 = new ArrayList<String>();
		listSpinnerQuestionG2.add("ne s�applique pas");
		listSpinnerQuestionG2.add("s�applique");

		dataAdapterSpinnerQuestionG2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionG2);

		List<String> listSpinnerQuestionH1 = new ArrayList<String>();
		listSpinnerQuestionH1.add("ind�pendante, fait seule ");
		listSpinnerQuestionH1
				.add("surveillance, supervision, directives, encouragement ");
		listSpinnerQuestionH1.add("d�pendance partielle, est parfois aid�e");
		listSpinnerQuestionH1.add("d�pendance importante, est toujours aid�e ");
		listSpinnerQuestionH1
				.add("d�pendance totale, activit� faite par autrui (lors de capacit� de performance = d�pendance totale) ");
		listSpinnerQuestionH1.add("l�activit� n�a pas �t� accomplie ");

		dataAdapterSpinnerQuestionH1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionH1);

		List<String> listSpinnerQuestionH2 = new ArrayList<String>();
		listSpinnerQuestionH2
				.add("ind�pendante (la cliente fait tout seule) ou pr�paration seulement");
		listSpinnerQuestionH2
				.add("surveillance, encouragement ou indications seulement ");
		listSpinnerQuestionH2
				.add("d�pendance partielle : cliente tr�s participative, re�oit une aide ne n�cessitant pas de force ");
		listSpinnerQuestionH2
				.add("d�pendance importante : cliente peu participative, re�oit une  aide n�cessitant de la force ");
		listSpinnerQuestionH2
				.add("d�pendance totale : cliente ne participe pas, activit� enti�- rement faite par d�autres durant les 3 derniers jours ");
		listSpinnerQuestionH2.add("l'activit� n'a pas �t� accomplie ");

		dataAdapterSpinnerQuestionH2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionH2);

		List<String> listSpinnerQuestionH3 = new ArrayList<String>();
		listSpinnerQuestionH3.add("Am�lior�");
		listSpinnerQuestionH3.add("D�t�rior�");
		listSpinnerQuestionH3.add("Pas de modification");
		listSpinnerQuestionH3.add("Ambigu");

		dataAdapterSpinnerQuestionH3 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionH3);

		List<String> listSpinnerQuestionH4 = new ArrayList<String>();
		listSpinnerQuestionH4.add("monte et descend sans aide");
		listSpinnerQuestionH4.add("monte et descend avec aide");
		listSpinnerQuestionH4.add("n�a pas  mont� ni descendu les escaliers");

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
		listSpinnerQuestionH5b
				.add("aucune sortie, mais la cliente sort habituellement de fa�on r�guli�re");
		listSpinnerQuestionH5b.add("la cliente ne sort jamais de son domicile");

		dataAdapterSpinnerQuestionH5b = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionH5b);

		List<String> listSpinnerQuestionOuiNon = new ArrayList<String>();
		listSpinnerQuestionOuiNon.add("oui");
		listSpinnerQuestionOuiNon.add("non");

		dataAdapterSpinnerQuestionH6aAndb = new ArrayAdapter<String>(
				getActivity(), android.R.layout.simple_spinner_item,
				listSpinnerQuestionOuiNon);

		List<String> listSpinnerQuestionI1 = new ArrayList<String>();
		listSpinnerQuestionI1
				.add("CONTINENTE, contr�le complet. N�utilise aucun type de sonde ou de moyen pour recueillir les urines. ");
		listSpinnerQuestionI1.add("CONTINENTE AVEC CATHETER OU STOM");
		listSpinnerQuestionI1
				.add("HABITUELLEMENT CONTINENTE � n�est pas incontinente chaque jour ");
		listSpinnerQuestionI1
				.add("INCONTINENTE AVEC RESTE DE CONTROLE �  incontinente  quasi quotidienne ; reste de contr�le possible");
		listSpinnerQuestionI1
				.add("INCONTINENTE: contr�le inad�quat, mouill�e plusieurs fois par jour ");
		listSpinnerQuestionI1
				.add("Aucune �mission d�urine provenant de la vessie");

		dataAdapterSpinnerQuestionI1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionI1);

		List<String> listSpinnerQuestionI2 = new ArrayList<String>();
		listSpinnerQuestionI2.add("CONTINENT �  contr�le complet sans stomie ");
		listSpinnerQuestionI2.add("CONTINENTE AVEC STOMIE ");
		listSpinnerQuestionI2
				.add("HABITUELLEMENT CONTINENTE � � n�est pas incontinente chaque jour ");
		listSpinnerQuestionI2
				.add("INCONTINENTE AVEC RESTE DE CONTROLE �  incontinente quotidiennement ; reste de contr�le possible ");
		listSpinnerQuestionI2
				.add("INCONTINENTE : incontinente quotidiennement ; inconti- nence f�cale : � peine encore de contr�le ");
		listSpinnerQuestionI2
				.add("Aucune �mission de selles durant les 3 derniers jours");

		dataAdapterSpinnerQuestionI2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionI2);

		dataAdapterSpinnerQuestionI3 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		dataAdapterSpinnerQuestionJ1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		List<String> listSpinnerQuestionK1 = new ArrayList<String>();
		listSpinnerQuestionK1.add("PAS PRESENT");
		listSpinnerQuestionK1
				.add("PRESENT, MAIS PAS DANS LES 3 DERNIERS JOURS");
		listSpinnerQuestionK1.add("PRESENT DANS LES 3 DRNIERS JOURS");

		dataAdapterSpinnerQuestionK1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionK1);

		List<String> listSpinnerQuestionK2 = new ArrayList<String>();
		listSpinnerQuestionK2.add("PAS PR�SENTE ");
		listSpinnerQuestionK2.add("PR�SENTE UNIQUEMENT LORS D�EFFORT MOYEN");
		listSpinnerQuestionK2.add("PRESENTE LORS D�EFFORTS QUOTIDIENS LEGERS");
		listSpinnerQuestionK2.add("PR�SENTE AU REPOS");

		dataAdapterSpinnerQuestionK2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionK2);

		List<String> listSpinnerQuestionK3 = new ArrayList<String>();
		listSpinnerQuestionK3.add("NON ");
		listSpinnerQuestionK3
				.add("L�G�RE - BAISSE D��NERGIE; EFFECTUE TOUT DE M�ME SES ACTIVIT�S HABITUELLES ");
		listSpinnerQuestionK3
				.add("MOYENNE - N�EST PAS CAPABLE � CAUSE D�UNE PERTE D��NERGIE, D�EFFECTUER SES ACTIVIT�S HABITUELLES JUSQU�AU BOUT");
		listSpinnerQuestionK3
				.add("IMPORTANTE  - EST INCAPABLE  � CAUSE D�UNE PERTE D��NERGIE DE COMMENCER QUELQUES ACTIVIT�S QUOTIDIENNES NORMALES ");
		listSpinnerQuestionK3
				.add("INCAPACIT� � CAUSE D�UNE PERTE D��NERGIE, DE COMMENCER  TOUTE ACTIVIT� QUOTIDIENNE HABITUELLE ");

		dataAdapterSpinnerQuestionK3 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionK3);

		List<String> listSpinnerQuestionK4a = new ArrayList<String>();
		listSpinnerQuestionK4a.add("pas de douleur ");
		listSpinnerQuestionK4a
				.add("douleur pr�sente, mais pas dans les 3 derniers  jours");
		listSpinnerQuestionK4a.add("douleur pr�sente 1ou 2 jours ");
		listSpinnerQuestionK4a.add("douleur quotidienne ");

		dataAdapterSpinnerQuestionK4a = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionK4a);

		List<String> listSpinnerQuestionK4b = new ArrayList<String>();
		listSpinnerQuestionK4b.add("pas de douleur ");
		listSpinnerQuestionK4b.add("douleurs l�g�res");
		listSpinnerQuestionK4b.add("douleurs moyennes");
		listSpinnerQuestionK4b.add("douleurs fortes");
		listSpinnerQuestionK4b.add("p�riodes de douleur atroce ou intol�rable");

		dataAdapterSpinnerQuestionK4b = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionK4b);

		List<String> listSpinnerQuestionK4c = new ArrayList<String>();
		listSpinnerQuestionK4c.add("n�est pas ad�quat lorsque aucune douleur");
		listSpinnerQuestionK4c.add("douleurs suffisamment ma�tris�es");
		listSpinnerQuestionK4c
				.add("pas d�adaptation n�cessaire de la th�rapie");
		listSpinnerQuestionK4c
				.add("des douleurs sont pr�sentes mais les m�dicaments ne sont pas pris");
		listSpinnerQuestionK4c
				.add("douleurs insuffisamment ma�tris�es, adaptation n�cessaire de la th�rapie ");

		dataAdapterSpinnerQuestionK4c = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionK4c);

		dataAdapterSpinnerQuestionK5 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		dataAdapterSpinnerQuestionK6 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		List<String> listSpinnerQuestionK7 = new ArrayList<String>();
		listSpinnerQuestionK7.add("non ");
		listSpinnerQuestionK7.add("oui ");
		listSpinnerQuestionK7.add("la cliente ne r�pond pas ");

		dataAdapterSpinnerQuestionK7 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionK7);

		dataAdapterSpinnerQuestionK8 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		dataAdapterSpinnerQuestionL2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		List<String> listSpinnerQuestionL3 = new ArrayList<String>();
		listSpinnerQuestionL3
				.add("NORMAL � AVALE TOUTES LES SORTES DE NOURRITURE  ");
		listSpinnerQuestionL3
				.add("REQUIERT DES MODIFICATIONS DES ALIMENTS SOLIDES POUR LES AVALER (PAR EX. HACH�E, BROY�E) ");
		listSpinnerQuestionL3
				.add("REQUIERT DES MODIFICATIONS POUR AVALER LES ALIMENTS SOLIDES ET LIQUIDES (PAR EX. BROY�E, LIQUIDE �PAISSIS) ");
		listSpinnerQuestionL3
				.add("ALIMENTATION COMBINEE PAR VOIE ORALE E PAR SONDE ");
		listSpinnerQuestionL3.add("AUCUNE ALIMENTATION ORALE");

		dataAdapterSpinnerQuestionL3 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionL3);

		dataAdapterSpinnerQuestionL4 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		List<String> listSpinnerQuestionL5 = new ArrayList<String>();
		listSpinnerQuestionL5.add("non ");
		listSpinnerQuestionL5.add("oui (probl�mes pr�sents) ");

		dataAdapterSpinnerQuestionL5 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionL5);

		dataAdapterSpinnerQuestionL6 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		dataAdapterSpinnerQuestionM1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		List<String> listSpinnerQuestionM2 = new ArrayList<String>();
		listSpinnerQuestionM2
				.add("stade 1 : zone de rougeur persistante (peau intacte) qui ne dispara�t pas si la pression est lev�e  ");
		listSpinnerQuestionM2
				.add("stade 2 : perte  partielle des couches de la peau, abrasion,  crat�re superficiel  ");
		listSpinnerQuestionM2
				.add("stade 3 : alt�ration compl�te de la peau (crat�re profond) qui peut envahir les tissus adjacents  ");
		listSpinnerQuestionM2
				.add("stade 4 : l�sions de la peau et des tissus sous-cutan�s exposant le muscle ou l'os. ");

		dataAdapterSpinnerQuestionM2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionM2);

		dataAdapterSpinnerQuestionM3 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		dataAdapterSpinnerQuestionM4 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		dataAdapterSpinnerQuestionN1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		List<String> listSpinnerQuestionO1 = new ArrayList<String>();
		listSpinnerQuestionO1.add("non ");
		listSpinnerQuestionO1.add("oui mais prestation termin�e ");
		listSpinnerQuestionO1.add("oui, prestation en cours");

		dataAdapterSpinnerQuestionO1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionO1);

		List<String> listSpinnerQuestionO2 = new ArrayList<String>();
		listSpinnerQuestionO2.add("non ");
		listSpinnerQuestionO2.add("oui, par un m�decin install� ");
		listSpinnerQuestionO2.add("oui, par un m�decin hospitalier ");

		dataAdapterSpinnerQuestionO2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionO2);

		List<String> listSpinnerQuestionP2a = new ArrayList<String>();
		listSpinnerQuestionP2a.add("le client");
		listSpinnerQuestionP2a.add("le SAD");
		listSpinnerQuestionP2a.add("autres");

		dataAdapterSpinnerQuestionP2a = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionP2a);

		List<String> listSpinnerQuestionP2b = new ArrayList<String>();
		listSpinnerQuestionP2b.add("chaque jour");
		listSpinnerQuestionP2b.add("chaque semaine");
		listSpinnerQuestionP2b.add("autre");

		dataAdapterSpinnerQuestionP2b = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionP2b);

		List<String> listSpinnerQuestionP3 = new ArrayList<String>();
		listSpinnerQuestionP3
				.add("Une liste actualis�e des m�dicaments avec dosage existe ");
		listSpinnerQuestionP3
				.add("Il faut �tablir une liste des m�dicaments avec dosage (voir feuille annexe)");
		listSpinnerQuestionP3
				.add("Une liste des m�dicaments n�est pas n�cessaire ");

		dataAdapterSpinnerQuestionP3 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionP3);

		List<String> listSpinnerQuestionP4 = new ArrayList<String>();
		listSpinnerQuestionP4.add("pas connues");
		listSpinnerQuestionP4.add("connues (voir annexe)");

		dataAdapterSpinnerQuestionP4 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionP4);

		dataAdapterSpinnerQuestionP5 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		List<String> listSpinnerQuestionP6 = new ArrayList<String>();
		listSpinnerQuestionP6.add("oui, toujours ");
		listSpinnerQuestionP6.add("� 80% du temps ou plus");
		listSpinnerQuestionP6
				.add("� moins de 80% du temps (y.c. le fait de ne pas avoir  achet� les m�dicaments prescrits)");

		dataAdapterSpinnerQuestionP6 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionP6);

		List<String> listSpinnerQuestionP7 = new ArrayList<String>();
		listSpinnerQuestionP7
				.add("La totalit� des m�dicaments a �t� discut�e au moins  avec un m�decin/un pharmacien");
		listSpinnerQuestionP7
				.add("La totalit� des m�dicaments n�a pas �t� contr�l�e  par un m�decin/un pharmacien");

		dataAdapterSpinnerQuestionP7 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionP7);

		dataAdapterSpinnerQuestionQ1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		List<String> listSpinnerQuestionQ2 = new ArrayList<String>();
		listSpinnerQuestionQ2.add("am�lior� ");
		listSpinnerQuestionQ2.add("pas de modification ");
		listSpinnerQuestionQ2.add("d�t�rior� ");

		dataAdapterSpinnerQuestionQ2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		dataAdapterSpinnerQuestionQ3 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionOuiNon);

		List<String> listSpinnerQuestionR1 = new ArrayList<String>();
		listSpinnerQuestionR1.add("non ");
		listSpinnerQuestionR1.add("oui ");
		listSpinnerQuestionR1.add("la cliente ne r�pond pas  ");

		dataAdapterSpinnerQuestionR1 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionR1);

		List<String> listSpinnerQuestionR2 = new ArrayList<String>();
		listSpinnerQuestionR2.add("non ");
		listSpinnerQuestionR2.add("oui ");
		listSpinnerQuestionR2.add("non pertinent pour la situation ");
		listSpinnerQuestionR2.add("la cliente ne r�pond pas  ");

		dataAdapterSpinnerQuestionR2 = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_spinner_item, listSpinnerQuestionR2);

		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long id) {
				final LinearLayout lm = (LinearLayout) rootView
						.findViewById(R.id.LinearLayoutFormulaire);

				// ListView Clicked item index
				int itemPosition = position;
				// ///////////////////////////////// AA
				// /////////////////////////////////////////////////
				if (itemPosition == 0) {
					// ////////////////// Question 1 //////////////////////
					lm.removeAllViews();

					// ListView Clicked item value
					String itemValue = (String) listView
							.getItemAtPosition(position);

					// Show Alert
					Toast.makeText(
							getActivity().getApplicationContext(),
							"Position :" + itemPosition + "  ListItem : "
									+ itemValue, Toast.LENGTH_LONG).show();

					// create the layout params that will be used to define how
					// your
					// button will be displayed
					LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
							LayoutParams.WRAP_CONTENT,
							LayoutParams.WRAP_CONTENT);

					// Create TextView
					TextView textViewQuestion1 = new TextView(getActivity());
					textViewQuestion1.setText("1 Date de la demande");
					lm.addView(textViewQuestion1);

					ImageButton imageDatePickerQuestion1 = new ImageButton(
							getActivity());
					imageDatePickerQuestion1
							.setImageResource(R.drawable.calendar_icon);

					final EditText edittextQuestion1 = new EditText(
							getActivity());
					edittextQuestion1.setEnabled(false);
					lm.addView(edittextQuestion1);

					imageDatePickerQuestion1
							.setOnClickListener(new OnClickListener() {
								public void onClick(View v) {

									Log.i("TAG", "index :");

									Toast.makeText(
											getActivity()
													.getApplicationContext(),
											"Clicked Button Index :",
											Toast.LENGTH_LONG).show();
									DialogFragment newFragmentDialogDate = new DatePickerFragment() {
										@Override
										public void onDateSet(DatePicker view,
												int year, int month, int day) {
											Date d = new Date(year, month, day);
											edittextQuestion1.setText(d
													.toString());
										}
									};
									;
									newFragmentDialogDate.show(
											getFragmentManager(), "timePicker");

								}
							});

					// Add button to LinearLayout defined in XML
					lm.addView(imageDatePickerQuestion1);
					// ////////////////// End Question 1 //////////////////////

					// ////////////////// Question 2 //////////////////////
					TextView TextViewQuestionSectionA = new TextView(
							getActivity());
					TextViewQuestionSectionA.setText("1 Nom / Pr�nom");
					lm.addView(TextViewQuestionSectionA);

					EditText edittextSectionA = new EditText(getActivity());
					lm.addView(edittextSectionA);

					// ////////////////// End Question 2 //////////////////////
					// ////////////////// Question 3 //////////////////////
					TextView TextViewNomSectionAA = new TextView(getActivity());
					TextViewNomSectionAA
							.setText("1 Fonction/Relation avec la cliente");
					lm.addView(TextViewNomSectionAA);

					EditText edittextSectionAA = new EditText(getActivity());
					lm.addView(edittextSectionAA);
					// ////////////////// End Question 3 //////////////////////
					// ////////////////// Question 4 //////////////////////
					TextView TextViewInstitutionSectionAA = new TextView(
							getActivity());
					TextViewInstitutionSectionAA.setText("1 Institution");
					lm.addView(TextViewInstitutionSectionAA);

					EditText edittextInstitutionSectionAA = new EditText(
							getActivity());
					lm.addView(edittextInstitutionSectionAA);
					// ////////////////// End Question 4 //////////////////////
					// ////////////////// Question 5 //////////////////////
					TextView TextViewAdresseSectionAA = new TextView(
							getActivity());
					TextViewAdresseSectionAA.setText("1 Adresse");
					lm.addView(TextViewAdresseSectionAA);

					EditText edittextAdresseSectionAA = new EditText(
							getActivity());
					lm.addView(edittextAdresseSectionAA);
					// ////////////////// End Question 5 //////////////////////
					// ////////////////// Question 6 //////////////////////
					TextView TextViewTelSectionAA = new TextView(getActivity());
					TextViewTelSectionAA.setText("1 T�l�phone");
					lm.addView(TextViewTelSectionAA);

					EditText edittextTelephoneSectionAA = new EditText(
							getActivity());
					edittextTelephoneSectionAA
							.setInputType(InputType.TYPE_CLASS_PHONE);
					lm.addView(edittextTelephoneSectionAA);
					// ////////////////// End Question 6 //////////////////////

				}
				// ////////////////////////// End AA ///////////////////////////

				// ///////////////////////////////// BB
				// /////////////////////////////////////////////////
				if (itemPosition == 1) {
					lm.removeAllViews();

					// ////////////////// Question 1 //////////////////////
					TextView TextViewNomSectionB = new TextView(getActivity());
					TextViewNomSectionB.setText("1 Nom de la cliente");
					lm.addView(TextViewNomSectionB);

					EditText edittextNomSectionB = new EditText(getActivity());
					lm.addView(edittextNomSectionB);

					// ////////////////// End Question 1 //////////////////////
					// ////////////////// Question 2 //////////////////////
					TextView TextViewPrenomSectionB = new TextView(
							getActivity());
					TextViewPrenomSectionB.setText("1 Pr�nom");
					lm.addView(TextViewPrenomSectionB);

					EditText edittextPrenomSectionB = new EditText(
							getActivity());
					lm.addView(edittextPrenomSectionB);
					// ////////////////// End Question 2 //////////////////////
					// ////////////////// Question 3 //////////////////////
					TextView TextViewAVSSectionB = new TextView(getActivity());
					TextViewAVSSectionB.setText("1 Num�ro d�assur� AVS");
					lm.addView(TextViewAVSSectionB);

					EditText edittextAVSSectionB = new EditText(getActivity());
					edittextAVSSectionB
							.setInputType(InputType.TYPE_CLASS_NUMBER);
					lm.addView(edittextAVSSectionB);
					// ////////////////// End Question 3 //////////////////////
					// ////////////////// Question 4 //////////////////////
					TextView TextViewDosInterneSectionB = new TextView(
							getActivity());
					TextViewDosInterneSectionB.setText("1 N� dossier interne");
					lm.addView(TextViewDosInterneSectionB);

					EditText edittextDosInterneSectionB = new EditText(
							getActivity());
					edittextDosInterneSectionB
							.setInputType(InputType.TYPE_CLASS_NUMBER);
					lm.addView(edittextDosInterneSectionB);
					// ////////////////// End Question 4 //////////////////////
					// ////////////////// Question 5 //////////////////////
					TextView TextViewRueSectionBB = new TextView(getActivity());
					TextViewRueSectionBB.setText("1 Rue");
					lm.addView(TextViewRueSectionBB);

					EditText edittextRueSectionBB = new EditText(getActivity());
					lm.addView(edittextRueSectionBB);
					// ////////////////// End Question 5 //////////////////////
					// ////////////////// Question 6 //////////////////////
					TextView TextViewNumSectionB = new TextView(
							getActivity());
					TextViewNumSectionB.setText("1 N�");
					lm.addView(TextViewNumSectionB);

					EditText edittextNumSectionB = new EditText(
							getActivity());
					edittextNumSectionB
							.setInputType(InputType.TYPE_CLASS_NUMBER);
					lm.addView(edittextNumSectionB);
					// ////////////////// End Question 6 //////////////////////
					// ////////////////// Question 7 //////////////////////
					TextView TextViewNumCarteAssureSectionB = new TextView(
							getActivity());
					TextViewNumCarteAssureSectionB.setText("1 Num�ro de la carte d�assur�");
					lm.addView(TextViewNumCarteAssureSectionB);

					EditText edittextNumCarteAssureSectionB = new EditText(
							getActivity());
					edittextNumCarteAssureSectionB
							.setInputType(InputType.TYPE_CLASS_NUMBER);
					lm.addView(edittextNumCarteAssureSectionB);
					// ////////////////// End Question 7 //////////////////////
					// ////////////////// Question 8 //////////////////////
					TextView TextViewCodepostalSectionB = new TextView(
							getActivity());
					TextViewCodepostalSectionB.setText("1 Code postal");
					lm.addView(TextViewCodepostalSectionB);

					EditText edittextCodepostalSectionB = new EditText(
							getActivity());
					edittextCodepostalSectionB
							.setInputType(InputType.TYPE_CLASS_NUMBER);
					lm.addView(edittextCodepostalSectionB);
					// ////////////////// End Question 8 //////////////////////
					// ////////////////// Question 9 //////////////////////
					TextView TextViewLieuSectionB = new TextView(
							getActivity());
					TextViewLieuSectionB.setText("1 Lieu");
					lm.addView(TextViewLieuSectionB);

					EditText edittextLieuSectionB = new EditText(
							getActivity());
					
					lm.addView(edittextLieuSectionB);
					// ////////////////// End Question 9 //////////////////////
					// ////////////////// Question 9 //////////////////////
					TextView TextViewAdresseSectionB = new TextView(
							getActivity());
					TextViewAdresseSectionB.setText("1 Adresse");
					lm.addView(TextViewAdresseSectionB);

					EditText edittextAdresseSectionB = new EditText(
							getActivity());
					
					lm.addView(edittextAdresseSectionB);
					// ////////////////// End Question 9 //////////////////////
					// ////////////////// Question 10 //////////////////////
					TextView TextViewEMailSectionB = new TextView(
							getActivity());
					TextViewEMailSectionB.setText("1 E-Mail");
					lm.addView(TextViewEMailSectionB);

					EditText edittextEMailSectionB = new EditText(
							getActivity());
					edittextEMailSectionB.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
					lm.addView(edittextEMailSectionB);
					// ////////////////// End Question 10 //////////////////////
					// ////////////////// Question 11 //////////////////////
					TextView TextViewQuestionB1a = new TextView(getActivity());
					TextViewQuestionB1a
							.setText("2 La personne est-elle membre de l�association du service?");
					lm.addView(TextViewQuestionB1a);

					Spinner spinnerQuestion_membre_association_service = new Spinner(getActivity());
					dataAdapterSpinnerQuestionB1
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinnerQuestion_membre_association_service.setAdapter(dataAdapterSpinnerQuestionB1);
					lm.addView(spinnerQuestion_membre_association_service);
					// ////////////////// End Question 11 //////////////////////
					// ////////////////// Question 12 //////////////////////
					TextView TextViewTelSectionB = new TextView(
							getActivity());
					TextViewTelSectionB.setText("2 T�l�phone");
					lm.addView(TextViewTelSectionB);

					EditText edittextTelSectionB = new EditText(
							getActivity());
					edittextTelSectionB.setInputType(InputType.TYPE_CLASS_PHONE);
					lm.addView(edittextTelSectionB);
					// ////////////////// End Question 12 //////////////////////
					// ////////////////// Question 12 //////////////////////
					TextView TextViewNatelSectionB = new TextView(
							getActivity());
					TextViewNatelSectionB.setText("2 Natel");
					lm.addView(TextViewNatelSectionB);

					EditText edittextNatelSectionB = new EditText(
							getActivity());
				
					lm.addView(edittextNatelSectionB);
					// ////////////////// End Question 12 //////////////////////
					// ////////////////// Question 13 //////////////////////
					TextView TextViewcaissemaladiebaseSectionB = new TextView(
							getActivity());
					TextViewcaissemaladiebaseSectionB.setText("3 Nom de la caisse maladie (assurance de base)");
					lm.addView(TextViewcaissemaladiebaseSectionB);

					EditText edittextcaissemaladiebaseSectionB = new EditText(
							getActivity());
				
					lm.addView(edittextcaissemaladiebaseSectionB);
					// ////////////////// End Question 13 //////////////////////
					// ////////////////// Question 14 //////////////////////
					TextView TextViewcaissemaladiecomplementaireSectionB = new TextView(
							getActivity());
					TextViewcaissemaladiecomplementaireSectionB.setText("3 Nom de la caisse maladie (assurance compl�mentaire)");
					lm.addView(TextViewcaissemaladiecomplementaireSectionB);

					EditText edittextcaissemaladiecomplementaireSectionB = new EditText(
							getActivity());
				
					lm.addView(edittextcaissemaladiecomplementaireSectionB);
					// ////////////////// End Question 14 //////////////////////
					// ////////////////// Question 15 //////////////////////
					TextView TextViewQuestionSexe = new TextView(getActivity());
					TextViewQuestionSexe
							.setText("4 Sexe");
					lm.addView(TextViewQuestionSexe);

					Spinner spinnerQuestion_Sexe = new Spinner(getActivity());
					dataAdapterSpinnerQuestionB1
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinnerQuestion_Sexe.setAdapter(dataAdapterSpinnerSexe);
					lm.addView(spinnerQuestion_Sexe);
					// ////////////////// End Question 15 //////////////////////
					// ////////////////// Question 16 //////////////////////
					TextView TextViewQuestionDate1 = new TextView(getActivity());
					TextViewQuestionDate1
							.setText("5 Date naissance (jour, mois, an)");
					lm.addView(TextViewQuestionDate1);

					ImageButton imageDatePickerQuestionDate1 = new ImageButton(
							getActivity());
					imageDatePickerQuestionDate1
							.setImageResource(R.drawable.calendar_icon);

					final EditText edittextQuestionDate1 = new EditText(
							getActivity());
					edittextQuestionDate1.setEnabled(false);
					lm.addView(edittextQuestionDate1);

					imageDatePickerQuestionDate1
							.setOnClickListener(new OnClickListener() {
								public void onClick(View v) {

									Log.i("TAG", "index :");

									Toast.makeText(
											getActivity()
													.getApplicationContext(),
											"Clicked Button Index :",
											Toast.LENGTH_LONG).show();
									DialogFragment newFragmentDialogDate = new DatePickerFragment() {
										@Override
										public void onDateSet(DatePicker view,
												int year, int month, int day) {
											Date d = new Date(year, month, day);
											edittextQuestionDate1.setText(d
													.toString());
										}
									};
									;
									newFragmentDialogDate.show(
											getFragmentManager(), "timePicker");

								}
							});

					// Add button to LinearLayout defined in XML
					lm.addView(imageDatePickerQuestionDate1);
					// ////////////////// End Question 16 //////////////////////
					// ////////////////// Question 17 //////////////////////
					TextView TextViewQuestionNationa = new TextView(getActivity());
					TextViewQuestionNationa
							.setText("6 Nationalit�");
					lm.addView(TextViewQuestionNationa);

					Spinner spinnerQuestion_Nationa = new Spinner(getActivity());
					dataAdapterSpinnerQuestionB1
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinnerQuestion_Nationa.setAdapter(dataAdapterSpinnerNationa);
					lm.addView(spinnerQuestion_Nationa);
					// ////////////////// End Question 17 //////////////////////
					// ////////////////// Question 18 //////////////////////
					TextView TextViewQuestionEtatcivil = new TextView(getActivity());
					TextViewQuestionEtatcivil
							.setText("7 Etat civil");
					lm.addView(TextViewQuestionEtatcivil);

					Spinner spinnerQuestion_Etatcivil = new Spinner(getActivity());
					dataAdapterSpinnerQuestionB1
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinnerQuestion_Etatcivil.setAdapter(dataAdapterSpinnerEtatcivil);
					lm.addView(spinnerQuestion_Etatcivil);
					// ////////////////// End Question 18 //////////////////////
					// ////////////////// Question 19 //////////////////////
					TextView TextViewQuestionLanguematernelle = new TextView(getActivity());
					TextViewQuestionLanguematernelle
							.setText("8 Langue maternelle");
					lm.addView(TextViewQuestionLanguematernelle);

					Spinner spinnerQuestion_Languematernelle = new Spinner(getActivity());
					dataAdapterSpinnerQuestionB1
							.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					spinnerQuestion_Languematernelle.setAdapter(dataAdapterSpinnerLanguematernelle);
					lm.addView(spinnerQuestion_Languematernelle);
					// ////////////////// End Question 19 //////////////////////
					// ////////////////// Question 20 //////////////////////
					TextView TextViewmetierSectionB = new TextView(
							getActivity());
					TextViewmetierSectionB.setText("9 Dernier m�tier pratiqu�");
					lm.addView(TextViewmetierSectionB);

					EditText edittextmetierSectionB = new EditText(
							getActivity());
				
					lm.addView(edittextmetierSectionB);
					// ////////////////// End Question 20 //////////////////////
					// ////////////////// Question 21 //////////////////////
					TextView TextViewRemarques_supSectionB = new TextView(
							getActivity());
					TextViewRemarques_supSectionB.setText("Remarques suppl�mentaires");
					lm.addView(TextViewRemarques_supSectionB);

					EditText edittextRemarques_supSectionB = new EditText(
							getActivity());
				
					lm.addView(edittextRemarques_supSectionB);
					// ////////////////// End Question 21 //////////////////////
				}
				// ////////////////////////// End BB ///////////////////////////

			}
		});

		return rootView;
	}

}
