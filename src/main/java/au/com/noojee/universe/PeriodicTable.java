package au.com.noojee.universe;

import java.util.*;


public class PeriodicTable 
{
	public final int m_nActinium	= 89;
	public final int m_nAluminium	= 13;
	public final int m_nAmericium	= 95;
	public final int m_nAntimony	= 51;
	public final int m_nArgon		= 18;
	public final int m_nArsenic		= 33;
	public final int m_nAstatine	= 85;
	public final int m_nBarium		= 56;
	public final int m_nBerkelium	= 97;
	public final int m_nBeryllium	= 4	;
	public final int m_nBismuth		= 83;
	public final int m_nBoron		= 5	;
	public final int m_nBromine		= 35;
	public final int m_nCadmium		= 48;
	public final int m_nCaesium		= 55;
	public final int m_nCalcium		= 20;
	public final int m_nCalifornium	= 98;
	public final int m_nCarbon		= 6	;
	public final int m_nCerium		= 58;
	public final int m_nChlorine	= 17;
	public final int m_nChromium	= 24;
	public final int m_nCobalt		= 27;
	public final int m_nCopper		= 29;
	public final int m_nCurium		= 96;
	public final int m_nCysprosium	= 66;
	public final int m_nEinsteinium	= 99;
	public final int m_nErbium		= 68;
	public final int m_nEuropium	= 63;
	public final int m_nFermium		= 100;
	public final int m_nFluorine	= 9	;
	public final int m_nFrancium	= 87;
	public final int m_nGadolinium	= 64;
	public final int m_nGallium		= 31;
	public final int m_nGermanium	= 32;
	public final int m_nGold		= 79;
	public final int m_nHafnium		= 72;
	public final int m_nHelium		= 2	;
	public final int m_nHolmium		= 67;
	public final int m_nHydrogen	= 1	;
	public final int m_nIndium		= 49;
	public final int m_nIodine		= 53;
	public final int m_nIron		= 26;
	public final int m_nKrypton		= 36;
	public final int m_nLanthanum	= 57;
	public final int m_nLawrencium	= 103;
	public final int m_nLead		= 82;
	public final int m_nLithium		= 3	;
	public final int m_nLutetium	= 71;
	public final int m_nMagnesium	= 12;
	public final int m_nManganese	= 25;
	public final int m_nMandelevium	= 101;
	public final int m_nMercury		= 80;
	public final int m_nMolybdenum	= 42;
	public final int m_nNeodymium	= 60;
	public final int m_nNeon		= 10;
	public final int m_nNeptunium	= 93;
	public final int m_nNickel		= 28;
	public final int m_nNiobium		= 41;
	public final int m_nNitrogen	= 7	;
	public final int m_nNobelium	= 102;
	public final int m_nOsmium		= 76;
	public final int m_nOxygen		= 8	;
	public final int m_nPalladium	= 46;
	public final int m_nPhosphorus	= 15;
	public final int m_nPlatinum	= 78;
	public final int m_nPlutonium	= 94;
	public final int m_nPolonium	= 84;
	public final int m_nPotassium	= 19;
	public final int m_nPraseodymium= 59;
	public final int m_nPromethium	= 61;
	public final int m_nProtactinium= 91;
	public final int m_nRadium		= 88;
	public final int m_nRadon		= 86;
	public final int m_nRhenium		= 75;
	public final int m_nRhodium		= 45;
	public final int m_nRubidium	= 37;
	public final int m_nRuthenium	= 44;
	public final int m_nSamarium	= 62;
	public final int m_nScandium	= 21;
	public final int m_nSelenium	= 34;
	public final int m_nSilicon		= 14;
	public final int m_nSilver		= 47;
	public final int m_nSodium		= 11;
	public final int m_nStrontium	= 38;
	public final int m_nSulfur		= 16;
	public final int m_nTantulum	= 73;
	public final int m_nTechnetium	= 43;
	public final int m_nTellurium	= 52;
	public final int m_nTerbium		= 65;
	public final int m_nThallium	= 81;
	public final int m_nThorium		= 90;
	public final int m_nThulium		= 69;
	public final int m_nTin			= 50;
	public final int m_nTitanium	= 22;
	public final int m_nTungsten	= 74;
	public final int m_nUranium		= 92;
	public final int m_nVanadium	= 23;
	public final int m_nXenon		= 54;
	public final int m_nYtterbium	= 70;
	public final int m_nYttrium		= 39;
	public final int m_nZinc		= 30;
	public final int m_nZirconium	= 40;




	private Atom[] m_Table
		= {
		new Atom("Hydrogen",		"H",	1)	// 	1.0080
		, new Atom("Helium",		"He",	2)	// 	4.00260
		, new Atom("Lithium",		"Li",	3)	// 	6.94
		, new Atom("Beryllium",		"Be",	4)	// 	9.01218
		, new Atom("Boron",			"B",	5)	// 	10.81
		, new Atom("Carbon",		"C",	6)	// 	12.011
		, new Atom("Nitrogen",		"N",	7)	// 	140067
		, new Atom("Oxygen",		"O",	8)	// 	15.9994
		, new Atom("Fluorine",		"F",	9)	// 	18.9984
		, new Atom("Neon",			"Ne",	10)	// 	20.179
		, new Atom("Sodium",		"Na",	11)	// 	22.9898
		, new Atom("Magnesium",		"Mg",	12)	// 	24.305
		, new Atom("Aluminium",		"Al",	13)
		, new Atom("Silicon",		"Si",	14)	// 	28.086
		, new Atom("Phosphorus",	"P",	15)	// 	30.9738
		, new Atom("Sulfur",		"S",	16)	// 	32.06
		, new Atom("Chlorine",		"Cl",	17)	// 	35.453
		, new Atom("Argon",			"Ar",	18)
		, new Atom("Potassium",		"K",	19)	// 	39.102
		, new Atom("Calcium",		"Ca",	20)	// 	40.08
		, new Atom("Scandium",		"Sc",	21)	// 	44.9055
		, new Atom("Titanium",		"Ti",	22)	// 	47.90
		, new Atom("Vanadium",		"V",	23)	// 	50.941
		, new Atom("Chromium",		"Cr",	24)	// 	51.996
		, new Atom("Manganese",		"Mn",	25)	// 	54.9380
		, new Atom("Iron",			"Fe",	26)	// 	55.847
		, new Atom("Cobalt",		"Co",	27)	// 	58.9332
		, new Atom("Nickel",		"Ni",	28)	// 	58.71
		, new Atom("Copper",		"Cu",	29)	// 	63.54
		, new Atom("Zinc",			"Zn",	30)	// 	65.37
		, new Atom("Gallium",		"Ga",	31)	// 	69.72
		, new Atom("Germanium",		"Ge",	32)	// 	72.59
		, new Atom("Arsenic",		"As",	33)
		, new Atom("Selenium",		"Se",	34)	// 	78.96
		, new Atom("Bromine",		"Br",	35)	// 	79.904
		, new Atom("Krypton",		"kr",	36)	// 	83.80
		, new Atom("Rubidium",		"Rb",	37)	// 	85.467
		, new Atom("Strontium",		"Sr",	38)	// 	87.62
		, new Atom("Yttrium",		"Y",	39)	// 	88.9059
		, new Atom("Zirconium",		"Zr",	40)	// 	91.32
		, new Atom("Niobium",		"Nb",	41)	// 	92.9064
		, new Atom("Molybdenum",	"Mo",	42)	// 	95.94
		, new Atom("Technetium",	"Tc",	43)	// 	
		, new Atom("Ruthenium",		"Ru",	44)	// 	101.07
		, new Atom("Rhodium",		"Rh",	45)	// 	102.9055
		, new Atom("Palladium",		"Pd",	46)	// 	106.4
		, new Atom("Silver",		"Ag",	47)	// 	107.868
		, new Atom("Cadmium",		"Cd",	48)	// 	112.40
		, new Atom("Indium",		"In",	49)	// 	114.82
		, new Atom("Tin",			"Sn",	50)	// 	118.69
		, new Atom("Antimony",		"Sb",	51)
		, new Atom("Tellurium",		"Te",	52)	// 	127.60
		, new Atom("Iodine",		"I",	53)	// 	126.9045
		, new Atom("Xenon",			"Xe",	54)	// 	131.30
		, new Atom("Caesium",		"Cs",	55)	// 	132.9055
		, new Atom("Barium",		"Ba",	56)	// 
		, new Atom("Lanthanum",		"La",	57)	// 	138.9055
		, new Atom("Cerium",		"Ce",	58)	// 	140.12
		, new Atom("Praseodymium",	"Pr",	59)	// 	140.9077
		, new Atom("Neodymium",		"Nd",	60)	// 	144.24
		, new Atom("Promethium",	"Pm",	61)	// 
		, new Atom("Samarium",		"Sm",	62)	// 	150.4
		, new Atom("Europium",		"Eu",	63)	// 	151.96
		, new Atom("Gadolinium",	"Gd",	64)	// 	157.25
		, new Atom("Terbium",		"Tb",	65)	// 	158.9254
		, new Atom("Cysprosium",	"Dy",	66)	// 	162.50
		, new Atom("Holmium",		"Ho",	67)	// 	164.9303
		, new Atom("Thulium",		"Tm",	69)	// 	168.9342
		, new Atom("Ytterbium",		"Yb",	70)	// 	173.04
		, new Atom("Lutetium",		"Lu",	71)	// 	174.97
		, new Atom("Hafnium",		"Hf",	72)	// 	178.49
		, new Atom("Tantulum",		"Ta",	73)	// 	180.947
		, new Atom("Tungsten",		"W",	74)	// 	183.85
		, new Atom("Rhenium",		"Re",	75)	// 	186.2
		, new Atom("Osmium",		"Os",	76)	// 	190.2
		, new Atom("Platinum",		"Pt",	78)	// 	105.90
		, new Atom("Gold",			"Au",	79)	// 	196.9665
		, new Atom("Mercury",		"Hg",	80)	// 	200.59
		, new Atom("Thallium",		"Tl",	81)	// 	204.37
		, new Atom("Lead",			"Pb",	82)	// 	207.2
		, new Atom("Bismuth",		"Bi",	83)	// 	208.9806
		, new Atom("Polonium",		"Po",	84)	// 	
		, new Atom("Astatine",		"At",	85)	// 
		, new Atom("Radon",			"Rn",	86)	// 
		, new Atom("Francium",		"Fr",	87)	// 
		, new Atom("Radium",		"Ra",	88)	// 
		, new Atom("Actinium",		"Ac",	89)
		, new Atom("Thorium",		"Th",	90)	// 	232.0381
		, new Atom("Protactinium",	"Pa",	91)	// 
		, new Atom("Uranium",		"U",	92)	// 	238.029
		, new Atom("Neptunium",		"Np",	93)	// 
		, new Atom("Plutonium",		"Pu",	94)	// 
		, new Atom("Americium",		"Am",	95)
		, new Atom("Curium",		"Cm",	96)	// 	
		, new Atom("Berkelium",		"Bk",	97)	//	
		, new Atom("Californium",	"Cf",	98)	// 	
		, new Atom("Einsteinium",	"Es",	99)	// 	
		, new Atom("Fermium",		"Fm",	100)	// 
		, new Atom("Mandelevium",	"Md",	101)	// 
		, new Atom("Nobelium",		"No",	102)	// 
		, new Atom("Lawrencium",	"Lr",	103)	// 	

	};
	
	private PeriodicTable()
	{
		m_self = this;
	}
	static public Enumeration<Element> elements()
	{
		if (m_self == null)
			m_self = new PeriodicTable();
		return new PeriodicTableEnumerator(m_self);
	}

	public int length()
	{
		return m_Table.length;
	}
	
	public Atom getElement(int nPos)
	{
		return m_Table[nPos];
	}
	
	private static PeriodicTable m_self;
}
