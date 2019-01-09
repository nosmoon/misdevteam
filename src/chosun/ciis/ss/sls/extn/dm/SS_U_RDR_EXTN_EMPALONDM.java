/***************************************************************************************************
* ���ϸ� : SS_U_RDR_EXTN_EMPALONDM.java
* ��� : ���Ȯ���ȸ ���� ������ ���� DM
* �ۼ����� : 2003-12-15
* �ۼ��� : ��뼷
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
 * class definition
 *
 */


public class SS_U_RDR_EXTN_EMPALONDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String rdr_extncampnoary;
	public String empseqary;
	public String checkedary;

	public SS_U_RDR_EXTN_EMPALONDM(){}
	public SS_U_RDR_EXTN_EMPALONDM(String incmgpers, String rdr_extncampnoary, String empseqary, String checkedary){
		this.incmgpers = incmgpers;
		this.rdr_extncampnoary = rdr_extncampnoary;
		this.empseqary = empseqary;
		this.checkedary = checkedary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRdr_extncampnoary(String rdr_extncampnoary){
		this.rdr_extncampnoary = rdr_extncampnoary;
	}

	public void setEmpseqary(String empseqary){
		this.empseqary = empseqary;
	}

	public void setCheckedary(String checkedary){
		this.checkedary = checkedary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRdr_extncampnoary(){
		return this.rdr_extncampnoary;
	}

	public String getEmpseqary(){
		return this.empseqary;
	}

	public String getCheckedary(){
		return this.checkedary;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_RDR_EXTN_EMPALON( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_RDR_EXTN_EMPALONDM dm = (SS_U_RDR_EXTN_EMPALONDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.rdr_extncampnoary);
		cstmt.setString(5, dm.empseqary);
		cstmt.setString(6, dm.checkedary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_U_RDR_EXTN_EMPALONDataSet();
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
String rdr_extncampnoary = req.getParameter("rdr_extncampnoary");
if( rdr_extncampnoary == null){
	System.out.println(this.toString+" : rdr_extncampnoary is null" );
}else{
	System.out.println(this.toString+" : rdr_extncampnoary is "+rdr_extncampnoary );
}
String empseqary = req.getParameter("empseqary");
if( empseqary == null){
	System.out.println(this.toString+" : empseqary is null" );
}else{
	System.out.println(this.toString+" : empseqary is "+empseqary );
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
String rdr_extncampnoary = Util.checkString(req.getParameter("rdr_extncampnoary"));
String empseqary = Util.checkString(req.getParameter("empseqary"));
String checkedary = Util.checkString(req.getParameter("checkedary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String rdr_extncampnoary = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampnoary")));
String empseqary = Util.Uni2Ksc(Util.checkString(req.getParameter("empseqary")));
String checkedary = Util.Uni2Ksc(Util.checkString(req.getParameter("checkedary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setRdr_extncampnoary(rdr_extncampnoary);
dm.setEmpseqary(empseqary);
dm.setCheckedary(checkedary);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 16 16:22:32 KST 2003 */