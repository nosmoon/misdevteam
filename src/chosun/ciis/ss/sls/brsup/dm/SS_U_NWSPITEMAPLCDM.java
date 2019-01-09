/***************************************************************************************************
* ���ϸ� : SS_U_NWSPITEMAPLCDM.java
* ��� : ��������-�Ź�������ǰ-��û-������ ���� DM
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-�Ź�������ǰ-��û-������ ���� DM
 */

public class SS_U_NWSPITEMAPLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String aplcdtary;
	public String aplcnoary;
	public String itemcdary;
	public String aplcquntary;
	public String checkedary;

	public SS_U_NWSPITEMAPLCDM(){}
	public SS_U_NWSPITEMAPLCDM(String incmgpers, String aplcdtary, String aplcnoary, String itemcdary, String aplcquntary, String checkedary){
		this.incmgpers = incmgpers;
		this.aplcdtary = aplcdtary;
		this.aplcnoary = aplcnoary;
		this.itemcdary = itemcdary;
		this.aplcquntary = aplcquntary;
		this.checkedary = checkedary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAplcdtary(String aplcdtary){
		this.aplcdtary = aplcdtary;
	}

	public void setAplcnoary(String aplcnoary){
		this.aplcnoary = aplcnoary;
	}

	public void setItemcdary(String itemcdary){
		this.itemcdary = itemcdary;
	}

	public void setAplcquntary(String aplcquntary){
		this.aplcquntary = aplcquntary;
	}

	public void setCheckedary(String checkedary){
		this.checkedary = checkedary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAplcdtary(){
		return this.aplcdtary;
	}

	public String getAplcnoary(){
		return this.aplcnoary;
	}

	public String getItemcdary(){
		return this.itemcdary;
	}

	public String getAplcquntary(){
		return this.aplcquntary;
	}

	public String getCheckedary(){
		return this.checkedary;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_NWSPITEMAPLC( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_NWSPITEMAPLCDM dm = (SS_U_NWSPITEMAPLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.aplcdtary);
		cstmt.setString(5, dm.aplcnoary);
		cstmt.setString(6, dm.itemcdary);
		cstmt.setString(7, dm.aplcquntary);
		cstmt.setString(8, dm.checkedary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_U_NWSPITEMAPLCDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String aplcdtary = req.getParameter("aplcdtary");
if( aplcdtary == null){
	System.out.println(this.toString+" : aplcdtary is null" );
}else{
	System.out.println(this.toString+" : aplcdtary is "+aplcdtary );
}
String aplcnoary = req.getParameter("aplcnoary");
if( aplcnoary == null){
	System.out.println(this.toString+" : aplcnoary is null" );
}else{
	System.out.println(this.toString+" : aplcnoary is "+aplcnoary );
}
String itemcdary = req.getParameter("itemcdary");
if( itemcdary == null){
	System.out.println(this.toString+" : itemcdary is null" );
}else{
	System.out.println(this.toString+" : itemcdary is "+itemcdary );
}
String aplcquntary = req.getParameter("aplcquntary");
if( aplcquntary == null){
	System.out.println(this.toString+" : aplcquntary is null" );
}else{
	System.out.println(this.toString+" : aplcquntary is "+aplcquntary );
}
String checkedary = req.getParameter("checkedary");
if( checkedary == null){
	System.out.println(this.toString+" : checkedary is null" );
}else{
	System.out.println(this.toString+" : checkedary is "+checkedary );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String aplcdtary = Util.checkString(req.getParameter("aplcdtary"));
String aplcnoary = Util.checkString(req.getParameter("aplcnoary"));
String itemcdary = Util.checkString(req.getParameter("itemcdary"));
String aplcquntary = Util.checkString(req.getParameter("aplcquntary"));
String checkedary = Util.checkString(req.getParameter("checkedary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String aplcdtary = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdtary")));
String aplcnoary = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcnoary")));
String itemcdary = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcdary")));
String aplcquntary = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcquntary")));
String checkedary = Util.Uni2Ksc(Util.checkString(req.getParameter("checkedary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setAplcdtary(aplcdtary);
dm.setAplcnoary(aplcnoary);
dm.setItemcdary(itemcdary);
dm.setAplcquntary(aplcquntary);
dm.setCheckedary(checkedary);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 24 12:47:53 KST 2004 */