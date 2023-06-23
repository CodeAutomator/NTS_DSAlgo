package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//This code defines a ConfigReader class that is responsible for reading configuration properties from a properties file. 

public class ConfigReader {

	public static Properties properties;
	private final static String propertyFilePath = ".\\src\\test\\resources\\config\\config.properties";
	private static String browserType = null;

	public static void readConfig() throws Throwable {

		/*
		 * This method reads the configuration properties from the specified file path
		 * (config.properties). It creates a FileInputStream to read the file, loads the
		 * properties using the load method of the Properties class, and then closes the
		 * input stream. If the file is not found, it throws a RuntimeException.
		 */

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();

			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Config.properties not found at" + propertyFilePath);
		}
	}

	// Browser Type
	public static void setbrowser(String browser) {
		browserType = browser;
	}

	public static String getbrowser() throws Throwable {
		String browserType = properties.getProperty("browser");
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("Browser Not Specified in Config.Properties file");
	}

	// Application URL
	public static String applicationUrl() {
		String url = properties.getProperty("appurl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Config.properties file");
	}

	// HomePage URL
	public static String gethomePage() {
		String homePageurl = properties.getProperty("homepageurl");
		if (homePageurl != null)
			return homePageurl;
		else
			throw new RuntimeException("HomePageurl not specified in the Config.properties file");
	}

	// ResisterPage URL
	public static String getRegisterPage() {
		String registerurl = properties.getProperty("registerurl");
		if (registerurl != null)
			return registerurl;
		else
			throw new RuntimeException("ResisterPage not specified in the Config.properties file");
	}

	// SigninPage URL
	public static String getSigninPage() {
		String signinurl = properties.getProperty("signinurl");
		if (signinurl != null)
			return signinurl;
		else
			throw new RuntimeException("ResisterPage not specified in the Config.properties file");
	}
	// get excelpath

	public static String getexcelfilepath() {
		String excelfilelpath = properties.getProperty("excelpath");
		if (excelfilelpath != null)
			return excelfilelpath;
		else
			throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
	}

	//page Url
	public static String geturl(String pagename) {
		String url = properties.getProperty(pagename);
		if (url != null)
			return url;
		else
			throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
	}
	// Queue page

	public static String getlinktoqueue() {
		String read_queue = properties.getProperty("queueurl");
		if (read_queue != null) {
			return read_queue;
		} else {
			throw new RuntimeException("QUEUE  page url not specified in config file");
		}
	}

	public static String getImpOfQPythonUrl() {
		String read_linkq = properties.getProperty("Queue_impurl");
		if (read_linkq != null) {
			return read_linkq;
		} else
			throw new RuntimeException("Queue Implementation  page not specified in config file");

	}

	public static String getEditorUrl() {
		String ed = properties.getProperty("editorurl");
		if (ed != null) {
			return ed;
		} else
			throw new RuntimeException("Editor page url not specified in config file");
	}

	public static String getImpCollDQUrl() {
		String coln = properties.getProperty("Queue_collect");
		if (coln != null)
			return coln;
		else
			throw new RuntimeException("Collection page url not specified in config file");

	}

	public static String getqueue_array() {
		String arr = properties.getProperty("Queue_imp_array");
		if (arr != null)
			return arr;
		else
			throw new RuntimeException("Queue Implementatiom Array page url not specified in config file");

	}

	public static String getqueue_opns() {
		String q_opr = properties.getProperty("Queue_operations");
		if (q_opr != null)
			return q_opr;
		else
			throw new RuntimeException("Queue Opeartions page url not specified in config file");

	}

	public static String getQPracQuesUrl() {
		String p_qt = properties.getProperty("Prac_quest");
		if (p_qt != null)
			return p_qt;
		else
			throw new RuntimeException("Practice Question page url not specified in config file");

	}

	// GraphPage URL

	public static String getGraphPage() {
		String graphurl = properties.getProperty("graphpageurl");
		if (graphurl != null)
			return graphurl;
		else
			throw new RuntimeException("GraphPage not specified in the Config.properties file");

	}

	
	public static String getGraphlinkPage() {
		String glinkurl = properties.getProperty("graphlinkurl");
		if (glinkurl != null)
			return glinkurl;
		else
			throw new RuntimeException("GraphPage link not specified in the Config.properties file");

	}


	public static String getGraphReplinkPage() {
		String greplinkurl = properties.getProperty("graphrepresentationslinkurl");
		if (greplinkurl != null)
			return greplinkurl;
		else
			throw new RuntimeException("Graph Representations Page link not specified in the Config.properties file");

	}

	

	public static String getGraphPQlinkPage() {
		String gpracqlinkurl = properties.getProperty("graphpracticelinkurl");
		if (gpracqlinkurl != null)
			return gpracqlinkurl;
		else
			throw new RuntimeException("Graph Representations Page link not specified in the Config.properties file");

	}
	

	// DataStructure URL
	public static String getDataStructureIntroPage() {
		String dsurl = properties.getProperty("datastructureurl");
		if (dsurl != null)
			return dsurl;
		else
			throw new RuntimeException("DataStructure Intro URL not specified in the Config.properties file");
	}

	public static String getDataStructureTimeComplexityPage() {
		String dsurl = properties.getProperty("dstimecomplexityurl");
		if (dsurl != null)
			return dsurl;
		else
			throw new RuntimeException("DataStructure time complexity URL not specified in the Config.properties file");
	}

	public static String getDataStructureTryEditorPage() {
		String dsurl = properties.getProperty("dstryeditorurl");
		if (dsurl != null)
			return dsurl;
		else
			throw new RuntimeException("DataStructure try editor URL not specified in the Config.properties file");
	}

	
	// stack URL
	public static String StackIntroPage() {
		String stackurl = properties.getProperty("stackhomeurl");
		if (stackurl != null)
			return stackurl;
		else
			throw new RuntimeException("Stack Intro URL not specified in the Config.properties file");
	}

	public static String StackOperationPage() {
		String stacoperationkurl = properties.getProperty("operstackurl");
		if (stacoperationkurl != null)
			return stacoperationkurl;
		else
			throw new RuntimeException("Stack operation URL not specified in the Config.properties file");

	}

	/*public static String StacktryherePage() {
		String stactryherekurl = properties.getProperty("tryherestackurl");
		if (stactryherekurl != null)
			return stactryherekurl;
		else
			throw new RuntimeException("Stack tryhere URL not specified in the Config.properties file");
	}*/

	public static String StacktryeditorPage() {
		String stacktryeditorkurl = properties.getProperty("tryeditorstackurl");
		if (stacktryeditorkurl != null)
			return stacktryeditorkurl;
		else
			throw new RuntimeException("Stack tryhereeditor URL not specified in the Config.properties file");
	}

	public static String Stackpracticspage() {
		String stackpracticskurl = properties.getProperty("practicsstackurl");
		if (stackpracticskurl != null)
			return stackpracticskurl;
		else
			throw new RuntimeException("Stack practics URL not specified in the Config.properties file");
	}


	//Array URL
	public static String getarrayPageURL() {
		String arrayPageurl = properties.getProperty("arraypageurl");
		if (arrayPageurl != null)
			return arrayPageurl;
		else
			throw new RuntimeException("Array Page url not specified in the Configuration.properties file.");
	}
	
	public static String getArraysinPythonurl() {
		String ArraysinPython = properties.getProperty("arrayPyUrl");
		if (ArraysinPython != null)
			return ArraysinPython;
		else
			throw new RuntimeException("Array Page url not specified in the Configuration.properties file.");
	}
	public static String tryEditorURL() {
		String tryeditorurl = properties.getProperty("TryEditorPage");
		if (tryeditorurl != null)
			return tryeditorurl;
		else
			throw new RuntimeException("tryeditorurl not specified in the Configuration.properties file.");
	}
	
	public static String getarraylisturl() {
		String arraylist = properties.getProperty("arraysListUrl");
		if (arraylist != null)
			return arraylist;
		else
			throw new RuntimeException("ArraysUsingList not specified in the Configuration.properties file.");
	}
	
	public static String getarraybasicoperationutl() {
		String arraybasicoperationlist = properties.getProperty("arraybasicopListUrl");
		if (arraybasicoperationlist != null)
			return arraybasicoperationlist;
		else
			throw new RuntimeException("BasicOperationsinLists not specified in the Configuration.properties file.");
	}
	public static String getarrayapplicationurl() {
		String arryapplicationpage = properties.getProperty("appArrayUrl");
		if (arryapplicationpage != null)
			return arryapplicationpage;
		else
			throw new RuntimeException("ApplicationsofArray not specified in the Configuration.properties file.");
	}
	
	public static String getarraypracticepageurl() {
		String arrypracticepage = properties.getProperty("arrayPracticeUrl");
		if (arrypracticepage != null)
			return arrypracticepage;
		else
			throw new RuntimeException("BasicOperationsinLists not specified in the Configuration.properties file.");
	}
	
	public static String getarrayquestionurl() {
		String arryquestionpage = properties.getProperty("arrayQuestUrl");
		if (arryquestionpage != null)
			return arryquestionpage;
		else
			throw new RuntimeException("BasicOperationsinLists specified in the Configuration.properties file.");
	}
	
	public static String ArrayQNumberswithEvenNumberofDigitsurl() {
		String QuestionFindNumberswithEvenNumberofDigitspage = properties.getProperty("QuestEvenNumberofDigits");
		if (QuestionFindNumberswithEvenNumberofDigitspage != null)
			return QuestionFindNumberswithEvenNumberofDigitspage;
		else
			throw new RuntimeException("QuestionFindNumberswithEvenNumberofDigits specified in the Configuration.properties file.");
	}
	
	public static String QuestionSquaresofaSortedArrayurl() {
		String QuestionSquaresofaSortedArrayurlpage = properties.getProperty("QuestSquaresofaSortedArray");
		if (QuestionSquaresofaSortedArrayurlpage != null)
			return QuestionSquaresofaSortedArrayurlpage;
		else
			throw new RuntimeException("QuestionSquaresofaSortedArray specified in the Configuration.properties file.");
	}
	
	// Linked list	
	public static String getLinkedListUrl() {								  
			String linkedlisturl = properties.getProperty("linkedlisturl");
			if (linkedlisturl != null)
				return linkedlisturl;
			else
				throw new RuntimeException("linked list url not specified in the Configuration.properties file.");
  
		}
	
	//LinkedlistPage  URL
	
	public static String getlinkedListUrl() {
		String linklist_gs = properties.getProperty("linkedlisturl");
		if (linklist_gs!= null) {
			return linklist_gs;
		} else {
			throw new RuntimeException("Linkedlist page url not specified in the Config.properties file");
		}
	}
	
	
	// LINKEDLIST INTRO URL
	
	public static String getLinkListIntroUrl() {
		String linklist_int = properties.getProperty("linklistIntroUrl");
		if (linklist_int!= null) {
			return  linklist_int;
		} else {
			throw new RuntimeException("Linkedlist Intro  page url not specified in the Config.properties file");
		}
	}
	
	//LINKEDLIST CREATION PAGE URL
	
	
	public static String getCreatingLinkListUrll() {
		String linklist_crt = properties.getProperty("CreateLinkListUrl");
		if (linklist_crt!= null) {
			return linklist_crt;
		} else {
			throw new RuntimeException("Linkedlist creation page url not specified in the Config.properties file");
		}
	}
	
	//LINKEDLIST Types of Linked list
	
	public static String getTypesLinkListUrl() {
		String linklist_typs = properties.getProperty("TypesLinklistUrl");
		if (linklist_typs!= null) {
			return linklist_typs;
		} else {
			throw new RuntimeException("Linkedlist Types page url not specified in the Config.properties file");
		}
	}
	
	//LINKEDLIST Implemention in Python
	public static String getImplementLinkListPython() {
		String linklist_pyt = properties.getProperty("ImpLinkListPythonUrl");
		if ( linklist_pyt != null) {
			return  linklist_pyt;
		} else {
			throw new RuntimeException("Linkedlist Implemention in Python page url not specified in the Config.properties file");
		}
	}
	
	//LINKEDLIST  Traversal
	
	
		public static String getlinklistTraversal() {
			String linklist_trv = properties.getProperty("linkListTraversalUrl");
			if ( linklist_trv != null) {
				return  linklist_trv;
			} else {
				throw new RuntimeException("Linkedlist Traversal page url not specified in the Config.properties file");
			}
		}
		
		//LINKEDLIST  Insertion
		
		
			public static String getlinklistInsertion() {
				String linklist_ins = properties.getProperty("linkListInsertionUrl");
				if ( linklist_ins != null) {
					return  linklist_ins;
				} else {
					throw new RuntimeException("Linkedlist Insertion page url not specified in the Config.properties file");
				}
			}
		
			//LINKEDLIST Deletion
			
			
			public static String getlinklistDeletion() {
				String linklist_del = properties.getProperty("linkListDeletionUrl");
				if ( linklist_del != null) {
					return  linklist_del;
				} else {
					throw new RuntimeException("Linkedlist Deletion page url not specified in the Config.properties file");
				}
			}
            //LINKEDLIST Practice Question
			
			
			public static String getlinklistPractquest() {
				String linklist_pq = properties.getProperty("linkListPracticeQUrl");
				if (  linklist_pq != null) {
					return   linklist_pq;
				} else {
					throw new RuntimeException("Linkedlist Deletion page url not specified in the Config.properties file");
				}
			}   
			
			// Tree
			public static String getTreeUrl() {
				String treeurl = properties.getProperty("treeurl");
				if (treeurl != null)
					return treeurl;
				else
					throw new RuntimeException("tree url not specified in the Configuration.properties file.");
			}
			public static String getTreeOverviewUrl() {
				String treeurl = properties.getProperty("treeoverviewurl");
				if (treeurl != null)
					return treeurl;
				else
					throw new RuntimeException("tree Overview url not specified in the Configuration.properties file.");
			}
			public static String getTreeTerminologiesUrl() {
				String treeurl = properties.getProperty("terminologiesurl");
				if (treeurl != null)
					return treeurl;
				else
					throw new RuntimeException("tree Overview url not specified in the Configuration.properties file.");
			}
			public static String getTreeTryeditor() {
				String treeurl = properties.getProperty("treetryeditorurl");
				if (treeurl != null)
					return treeurl;
				else
					throw new RuntimeException("tree try editor url not specified in the Configuration.properties file.");
			}

			
			public static String getTypesofTreesUrl() {
				String treeurl = properties.getProperty("typesoftreesurl");
				if (treeurl != null)
					return treeurl;
				else 
					throw new RuntimeException("Types of Trees url not specified in the Configuration.properties file.");
			}
			
			public static String getTreeTraversUrl() {
				String treeurl = properties.getProperty("treetraversurl");
				if (treeurl != null)
					return treeurl;
				else
					throw new RuntimeException("Tree Traversal url not specified in the Configuration.properties file.");
			}
			
			public static String getBinaryTreesUrl() {
				String treeurl = properties.getProperty("binarytreesurl");
				if (treeurl != null)
					return treeurl;
				else
					throw new RuntimeException("binary treesurl url not specified in the Configuration.properties file.");
			}
			
			
			public static String getTypesofBinaryTreesurlUrl() {
				String treeurl = properties.getProperty("typesofbinarytreesurl");
				if (treeurl != null)
					return treeurl;
				else
					throw new RuntimeException("types of binary trees url not specified in the Configuration.properties file.");
			}
			
			
			public static String getTreeTraversillustratUrl() {
				String treeurl = properties.getProperty("traversillustraturl");
				if (treeurl != null)
					return treeurl;
				else
					throw new RuntimeException("tree Traversal-illustration url not specified in the Configuration.properties file.");
			}
			
			
			public static String getTreePracticequest() {
				String treeurl = properties.getProperty("treePractQuesrurl");
				if (treeurl != null)
					return treeurl;
				else
					throw new RuntimeException("tree Practice Questions url not specified in the Configuration.properties file.");
			}

}
