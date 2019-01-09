/***************************************************************************************************
* ���ϸ� : SS_U_RDR_EXTN_CYBCOSTDM.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-������-����
* �ۼ����� : 2004-04-09
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-������-����
 *
 */

public class SS_U_RDR_EXTN_CYBCOSTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String basidtary;
	public String bocdary;
	public String checkedary;

	public SS_U_RDR_EXTN_CYBCOSTDM(){}
	public SS_U_RDR_EXTN_CYBCOSTDM(String incmgpers, String accflag, String basidtary, String bocdary, String checkedary){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.basidtary = basidtary;
		this.bocdary = bocdary;
		this.checkedary = checkedary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBasidtary(String basidtary){
		this.basidtary = basidtary;
	}

	public void setBocdary(String bocdary){
		this.bocdary = bocdary;
	}

	public void setCheckedary(String checkedary){
		this.checkedary = checkedary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBasidtary(){
		return this.basidtary;
	}

	public String getBocdary(){
		return this.bocdary;
	}

	public String getCheckedary(){
		return this.checkedary;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_RDR_EXTN_CYBCOST( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_RDR_EXTN_CYBCOSTDM dm = (SS_U_RDR_EXTN_CYBCOSTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.basidtary);
		cstmt.setString(6, dm.bocdary);
		cstmt.setString(7, dm.checkedary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_RDR_EXTN_CYBCOSTDataSet();
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String basidtary = req.getParameter("basidtary");
if( basidtary == null){
	System.out.println(this.toString+" : basidtary is null" );
}else{
	System.out.println(this.toString+" : basidtary is "+basidtary );
}
String bocdary = req.getParameter("bocdary");
if( bocdary == null){
	System.out.println(this.toString+" : bocdary is null" );
}else{
	System.out.println(this.toString+" : bocdary is "+bocdary );
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
String accflag = Util.checkString(req.getParameter("accflag"));
String basidtary = Util.checkString(req.getParameter("basidtary"));
String bocdary = Util.checkString(req.getParameter("bocdary"));
String checkedary = Util.checkString(req.getParameter("checkedary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String basidtary = Util.Uni2Ksc(Util.checkString(req.getParameter("basidtary")));
String bocdary = Util.Uni2Ksc(Util.checkString(req.getParameter("bocdary")));
String checkedary = Util.Uni2Ksc(Util.checkString(req.getParameter("checkedary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setBasidtary(basidtary);
dm.setBocdary(bocdary);
dm.setCheckedary(checkedary);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 09 16:15:12 KST 2004 */