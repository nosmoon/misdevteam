/***************************************************************************************************
* ���ϸ� : SS_A_MIGLLMMT_CLOSDM.java
* ��� : ������-���ϸ���-����-���,����,������ ���� DM
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * ������-���ϸ���-����-���,����,������ ���� DM
 */

public class SS_A_MIGLLMMT_CLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String basidt;
	public String frdt;
	public String todt;
	public String closdt;

	public SS_A_MIGLLMMT_CLOSDM(){}
	public SS_A_MIGLLMMT_CLOSDM(String incmgpers, String accflag, String basidt, String frdt, String todt, String closdt){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.basidt = basidt;
		this.frdt = frdt;
		this.todt = todt;
		this.closdt = closdt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getClosdt(){
		return this.closdt;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_MIGLLMMT_CLOS( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_MIGLLMMT_CLOSDM dm = (SS_A_MIGLLMMT_CLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.basidt);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.closdt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_MIGLLMMT_CLOSDataSet();
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
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String closdt = req.getParameter("closdt");
if( closdt == null){
	System.out.println(this.toString+" : closdt is null" );
}else{
	System.out.println(this.toString+" : closdt is "+closdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String basidt = Util.checkString(req.getParameter("basidt"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String closdt = Util.checkString(req.getParameter("closdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String closdt = Util.Uni2Ksc(Util.checkString(req.getParameter("closdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setBasidt(basidt);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setClosdt(closdt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 22 11:37:23 KST 2004 */