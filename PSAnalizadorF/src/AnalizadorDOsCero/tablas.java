package AnalizadorDOsCero;

public class tablas {
	String [][] tabla1 = 
		{
				{" " ,"identificador","id_ent","abP"  		,"ciP"	,"op_sum"  		,"op_res"		,"op_mult"		,"op_div"		,"id_cad"	,"id_cart","finale"	},
				{"E" ,"T E�"		 ,"T E�"  ,"T E�" 		," "  	," "	   		," "	    	," "	  		," "	  		,"T E�"		,"T E�"	  ,"�"		},
				{"E�"," "			 ," "	  ," "	  		,"�"  	,"op_sum T E�"	,"op_res T E�"	,"�"	  		,"�"	   		," "	 	," "	  ,"�"		},	
				{"T" ,"F T�"		 ,"F T�"  ,"F T�" 		," "  	," "	   		," "	    	," "	  		," "	   		,"F T�"		,"F T�"	  ,"�"		},
				{"T�"," "			 ," "	  ," "	  		,"�"  	,"�"	   		,"�"			,"op_mult F T�" ,"op_div F T�"	," "	 	," "	  ,"�"		},
				{"F" ,"identificador","id_ent","abP E ciP"	," "	," "       		," "			," "	  		," "	   		,"id_cad"	,"id_cart","�"		}
		};
	String [][] tabla11 = 
		{
				{" " ,"identificador","id_ent","abP"  		,"ciP"		,"op_sum"  		,"op_res"		,"op_mult"		,"op_div"		,"id_cad"	,"id_cart","finale"	},
				{"E" ,"T E�"		 ,"T E�"  ,"T E�" 		,"saltar"	,"saltar"	   	,"saltar"	    ,"saltar"	  	,"saltar"	  	,"T E�"		,"T E�"	  ,"sacar"		},
				{"E�","saltar"		 ,"saltar","saltar"	  	,"�"  		,"op_sum T E�"	,"op_res T E�"	,"�"	  		,"�"	   		,"saltar"	,"saltar"	  ,"�"		},	
				{"T" ,"F T�"		 ,"F T�"  ,"F T�" 		,"saltar"	,"saltar"	   	,"saltar"	    ,"saltar"	  	,"saltar"	   	,"F T�"		,"F T�"	  ,"sacar"		},
				{"T�","saltar"		 ,"saltar","saltar"	  	,"�"  		,"�"	   		,"�"			,"op_mult F T�" ,"op_div F T�"	,"saltar"	,"saltar"	  ,"�"		},
				{"F" ,"identificador","id_ent","abP E ciP"	,"saltar"	,"saltar"      ,"saltar"		,"saltar"	  	,"saltar"	   	,"id_cad"	,"id_cart","sacar"		}
		};
	
	String [][] laperrona = 
		{
				{" "          	,"identificador"		,"id_ent"		,"id_dec"		,"id_cad"	,"id_cart"		,"("			,")","+"		,"-"		,"*","/"	,"mod"		,"ala"		,"tallo"		,"<"	,">"	,"<="	,">="	,"!="	,"=="	,"!!"	,"&"	 ,"||"		,"verdadero"	,"falso"		,"cambio"		,"caso"	,"si"					,"sino"					,"para"					,"mientras"				,"repeat"				,"hacer","endif","endfor","endmientras" ,"principal","clase","ent"	,"dec"	,"cart"	,"cad"	,"bool"	,"->",","				,"proc"	,"funcion"	,"finproc"	,"finfuncion"	,"endfin"	,"idproc"				,"idfuncion"				,"retornar"	,"$"	},	
				{"prog"			," "					," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," " 	," " 					," "					," "					," "					," "					," "	," "	," "	 ," "			,"principal clase id inicio crea sentencias finclase",	"clase id inicio crea sentencias finclase"			," "	," "," "," "," "," "," "," "," "," "," "," "	," "," "," "								," "	},															
				{"crea"			," "					," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	," " 					," "					," "					," "					," "					," "	," "	," "	 ," "			," "		," "	,"dec crea",	"dec crea",	"dec crea",	"dec crea"				,"dec crea",	" "	," "		,"modulos crea"	,	"modulos crea"," "," "," "," "	," "," "								," "	},							
				{"dec"			," "					," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	," " 					," "					," "					," "					," "					," "	," "	," "	 ," " 			," "		," "	,"ent identificador sigid ;",	 "dec id sigid ;"				,"cart id sigid ;"	,	 "cad id sigid ;","bool id sigid ;"," "," "," "," "," "," "	,"�"," "," "	," "					," " 	},					
				{"sigid"		," "					," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	," " 					," "					," "					," "					," "					," "	," "	," "	 ," "			," "		," "	," "	," "	," "	," "	," "	,"> L sigid"			,", identificador sigid"		," "			," "		," "		," "			," "," "," "," "					," "	},										
				{"modulos"		,"�"					," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	,"�" 					," "					,"�"					,"�"					,"�"					," "	," "	," "	 ," "			," "		," "	,"�"	,"�"	,"�"	,"�"	,"�"	," " ," "				,"procedimiento"	, 	"funcion","�"			," "		," "		," "			," "	," "						," "	},				
				{"procedimiento"," "					," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	," " 					," "					," "					," "					," "					," "	," "	," "	 ," "			," "		," "	," "	," "	," "	," "	," "	," " ," "				,"procedimiento idproc ( list-arg ) inicio sentencias finproc"			," "," "," "	," "," "," "," "					," "	},							
				{"funcion"      ," "					," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	," " 					," "					," "					," "					," "					," "	," "	," "	 ," "			," "		," "	," "	," "	," "	," "	," "	," " ," "				," "	,"funcion idf ( list-arg ) tiporetorno inicio sentencias endf"		," "," "	," "," "," "," "					," "	},								
				{"tiporetorno"	," "					," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	," " 					," "					," "					," "					," "					," "	," "	," "	 ," "			," "		," "	,"ent"	,"dec"	,"cart"	,"cad"	,"bool"	," " ," " 				," " 	," " 		," " 		," " 			," " 		," " 		," " 			," " 								," "	},		
				{"list-arg"		," "					," "			," "			," "		," "			," "			,"�"," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	," " 					," "					," "					," "					," "					," "	," "	," "	 ," "			," "		," "	,"ent identificador siglist","dec identificador siglist"		,"cart identificador siglist","cad identificador siglist","bool identificador siglist"	," "," "," "," "," "," "," "," "," "," "," "},												
				{"siglist"		," "					," "			," "			," "		," "			," "			,"�"," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	," " 					," "					," "					," "					," "					," "	," "	," "	 ," "			," "		," "	," "	," "	," "	," "	," "	," " ,"list-arg"		," "	," "		," "		," "			," "		," "					," "						," "		," "	},
				{"list-param"	,"L sig-param"			,"L sig-param"	,"L sig-param","L sig-param","L sig-param"	,"L sig-param"	,"�"," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			,"L sig-param"	,"L sig-param"	," "	," " 					," "					," "					," "					," "					," "	," "	," "	 ," "			," "		," "	," "	," "	," "	," "	," "	," " ," "				," "	," "		," "		," "			," "		," "					,"L sig-param"				," "		," "	}, 			
				{"sig-param"	," "					," "			," "			," "		," "			," "			,"�"," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	," " 					," "					," "					," "					," "					," "	," "	," "	 ," "			," "		," "	," "	," "	," "	," "	," "	," " ,", L sig-param"	," "	," "		," "		," "			," "		," "					," "						," "		," " 	},										
				{"sentencias"	,"sentencia sentencias"	," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	,"sentencia sentencias"	," "					,"sentencia sentencias"	,"sentencia sentencias"	, "sentencia sentencias"," "	,"�"	,"�"	 ,"�"			," "		," "	," "	," "	," "	," "	," "	," " ," "				," "	," "		,"�"		,"�"			,"�"		,"sentencia sentencias"	," "			,"sentencia sentencias"	,"�"	},	
				{"sentencia"	,"asigna;"				," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			,"cambio ( id ) inicio caso ( L ) ?: sentencias sigcaso default ?: sentencias ruptura ; fin"," ","si L inicio sentencias sino endif"," ","para L do sentencias endpara","mientras L do sentencias endmientras","repeat sentencias until L ;"," "," "," "," "," "," ","dec sentencias","dec sentencias","dec sentencias"  ,"dec sentencias","dec sentencias"," "," "," "," "," "," "," "	,"asigna;","asigna;"," "},
				{"sigcaso"		," "					," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			,"caso ( L ) ?: sentencias ruptura ; sigcaso" 			," "					," "					," "					," " 	," " 	," " 	," " 			," "		," "	," " 	," "	," "	," "	," "	," " ," "				," "	," "		," "		," "			," "		," "	 				," "						," "		," "	}, 																												
				{"sigif"		," "					," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," "	," "	 ," " 		," "			," "			," "			," "	," "					,"sino sentencias"		," "					," "					," "					," "	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		," "					," "						," "		," "	},																			
				{"asigna"		,"id -> L"				," "			," "			," "		," "			," "			," "," "		," "		," "," "	," "		," "		," "			," "	," "	," " 	," " 	," " 	," " 	," " 	," "	 ," " 		," "			," "			," "			," "	," "					," "					," "					," "					," "					," "	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		,"idproc ( list-param )"," "						,"retornar L"," "	},				
				{"L"			,"R L�"					,"R L�"			,"R L�"			,"R L�"		,"R L�"			,"R L�"			," "," "		," "		," "," "	," "		,"R L�"		,"R L�"			," "	," "	," " 	," " 	," " 	," " 	,"!! L"	," "	 ," " 		,"R L�"			,"R L�"			," "			," "	," "					," "					," "					," "					," "					," "	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		," "					,"R L�"						," "		," "	},											
				{"L�"			," "					," "			," "			," "		," "			," "			,"�","�"		,"�"		,"�","�"	,"�"		," "		," "			,"�"	,"�"	,"�" 	,"�" 	,"�" 	,"�" 	," "	,"& R L�","|| R L�" ," "			," "			," "			," "	," "					," "					," "					," "					," "					,"�"	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		," "					," "						," "		,"�"	},																											
				{"R"			,"E R�"					,"E R�"			,"E R�"			,"E R�"		,"E R�"			,"E R�"			," "," "		," "		," "," "	," "		,"E R�" 	,"E R�" 		," "	," "	," " 	," " 	," " 	," " 	," " 	,"�" 	 ,"�"  		,"E R�"			,"E R�"			," "			," "	," "					," "					," "					," "					," "					,"�"	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		," "					,"E R�"						," "		,"�"	},
				{"R�"			," "					," "			," "			," "		," "			," "			,"�","�"		,"�"		,"�","�"	,"�"		," "		," "			,"< E"	,"> E"	,"<= E"	,">= E"	,"! E"	,"== E"	," "	,"�"	 ,"�"		," "			," "			," "			," "	," "					," "					," "					," "					," "					,"�"	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		," "					," "						," "		,"�"	},									
				{"E"			,"T E�"					,"T E�"			,"T E�"			,"T E�"		,"T E�"			,"T E�"			," "," "		," "		," "," "	," "		,"T E�"		,"T E�"			," "	," "	," " 	," " 	," " 	," " 	," "	," "	 ," "		,"T E�"			,"T E�"			," "			," "	," "					," "					," "					," "					," "					," "	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		," "					,"T E�"						," "		," "	},															
				{"E�"			," "					," "			," "			," "		," "			," "			,"�","+ T E�"	,"- T E�"	,"�","�"	,"�"		," "		," "			,"�"	,"�"	,"�" 	,"�" 	,"�" 	,"�" 	," "	,"�"	 ,"�"		," "			," "			," "			," "	," "					," "					," "					," "					," "					,"�"	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		," "					," "						," "		,"�"	},																		
				{"T"			,"F T�"					,"F T�"			,"F T�"			,"F T�"		,"F T�"			,"F T�"			," "," "		," "		," "," "	," "		,"F T�"		,"F T�"			," "	," "	," " 	," " 	," " 	," " 	," "	," "	 ," "		,"F T�"			,"F T�"			," "			," "	," "					," "					," "					," "					," "					," "	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		," "					,"F T�"						," "		," "	},																														
				{"T�"			," "					," "			," "			," "		," "			," "			,"�","�"		,"�"		,"* F T�"	,"* F T�"	,"mod F T�"	," "			,"�"	,"�"	,"�"	,"�"	,"�" 	,"�" 	," "	,"�"	 ,"�"		," "			," "			," "			," "	," "					," "					," "					," "					," "					,"�"	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		," "					," "						," "		,"�"	},											
				{"F"			,"identificador"		,"id_ent"		,"id_dec"		,"id_cad"	,"id_cart"		,"( L )"		," "," "		," "		," "," "	," "		,"ala ( L )","tallo ( L )"	," "	," "	," " 	," " 	," " 	," " 	," "	," "	 ," "		,"true"			,"false"		," "			," "	," "					," "					," "					," "					," "					," "	," "	," "	 ," "	 		," "		," "	," "	," "	," "	," "	," "	," "	," " 			," "	," "		," "		," "			," "		," "					,"idfuncion ( list-param )"	," "		," "	},												
	};

}