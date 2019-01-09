/***************************************************************************************************
* ���ϸ� : SS_U_INSRAMTDM.java
* ��� : ��������-���غ���-�����-����(����)�� ���� DM
* �ۼ����� : 2004-02-24
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
 * ��������-���غ���-�����-����(����)�� ���� DM
 */

public class SS_U_INSRAMTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String acpndtary;
	public String accdacpnnoary;
	public String accdcauscdary;
	public String accdtypecdary;
	public String insramtary;
	public String checkedary;

	public SS_U_INSRAMTDM(){}
	public SS_U_INSRAMTDM(String incmgpers, String acpndtary, String accdacpnnoary, String accdcauscdary, String accdtypecdary, String insramtary, String checkedary){
		this.incmgpers = incmgpers;
		this.acpndtary = acpndtary;
		this.accdacpnnoary = accdacpnnoary;
		this.accdcauscdary = accdcauscdary;
		this.accdtypecdary = accdtypecdary;
		this.insramtary = insramtary;
		this.checkedary = checkedary;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAcpndtary(String acpndtary){
		this.acpndtary = acpndtary;
	}

	public void setAccdacpnnoary(String accdacpnnoary){
		this.accdacpnnoary = accdacpnnoary;
	}

	public void setAccdcauscdary(String accdcauscdary){
		this.accdcauscdary = accdcauscdary;
	}

	public void setAccdtypecdary(String accdtypecdary){
		this.accdtypecdary = accdtypecdary;
	}

	public void setInsramtary(String insramtary){
		this.insramtary = insramtary;
	}

	public void setCheckedary(String checkedary){
		this.checkedary = checkedary;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAcpndtary(){
		return this.acpndtary;
	}

	public String getAccdacpnnoary(){
		return this.accdacpnnoary;
	}

	public String getAccdcauscdary(){
		return this.accdcauscdary;
	}

	public String getAccdtypecdary(){
		return this.accdtypecdary;
	}

	public String getInsramtary(){
		return this.insramtary;
	}

	public String getCheckedary(){
		return this.checkedary;
	}

	public String getSQL(){
		 return "{ call SP_SS_U_INSRAMT( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_U_INSRAMTDM dm = (SS_U_INSRAMTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.acpndtary);
		cstmt.setString(5, dm.accdacpnnoary);
		cstmt.setString(6, dm.accdcauscdary);
		cstmt.setString(7, dm.accdtypecdary);
		cstmt.setString(8, dm.insramtary);
		cstmt.setString(9, dm.checkedary);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_U_INSRAMTDataSet();
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
String acpndtary = req.getParameter("acpndtary");
if( acpndtary == null){
	System.out.println(this.toString+" : acpndtary is null" );
}else{
	System.out.println(this.toString+" : acpndtary is "+acpndtary );
}
String accdacpnnoary = req.getParameter("accdacpnnoary");
if( accdacpnnoary == null){
	System.out.println(this.toString+" : accdacpnnoary is null" );
}else{
	System.out.println(this.toString+" : accdacpnnoary is "+accdacpnnoary );
}
String accdcauscdary = req.getParameter("accdcauscdary");
if( accdcauscdary == null){
	System.out.println(this.toString+" : accdcauscdary is null" );
}else{
	System.out.println(this.toString+" : accdcauscdary is "+accdcauscdary );
}
String accdtypecdary = req.getParameter("accdtypecdary");
if( accdtypecdary == null){
	System.out.println(this.toString+" : accdtypecdary is null" );
}else{
	System.out.println(this.toString+" : accdtypecdary is "+accdtypecdary );
}
String insramtary = req.getParameter("insramtary");
if( insramtary == null){
	System.out.println(this.toString+" : insramtary is null" );
}else{
	System.out.println(this.toString+" : insramtary is "+insramtary );
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
String acpndtary = Util.checkString(req.getParameter("acpndtary"));
String accdacpnnoary = Util.checkString(req.getParameter("accdacpnnoary"));
String accdcauscdary = Util.checkString(req.getParameter("accdcauscdary"));
String accdtypecdary = Util.checkString(req.getParameter("accdtypecdary"));
String insramtary = Util.checkString(req.getParameter("insramtary"));
String checkedary = Util.checkString(req.getParameter("checkedary"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String acpndtary = Util.Uni2Ksc(Util.checkString(req.getParameter("acpndtary")));
String accdacpnnoary = Util.Uni2Ksc(Util.checkString(req.getParameter("accdacpnnoary")));
String accdcauscdary = Util.Uni2Ksc(Util.checkString(req.getParameter("accdcauscdary")));
String accdtypecdary = Util.Uni2Ksc(Util.checkString(req.getParameter("accdtypecdary")));
String insramtary = Util.Uni2Ksc(Util.checkString(req.getParameter("insramtary")));
String checkedary = Util.Uni2Ksc(Util.checkString(req.getParameter("checkedary")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setAcpndtary(acpndtary);
dm.setAccdacpnnoary(accdacpnnoary);
dm.setAccdcauscdary(accdcauscdary);
dm.setAccdtypecdary(accdtypecdary);
dm.setInsramtary(insramtary);
dm.setCheckedary(checkedary);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 24 14:38:14 KST 2004 */