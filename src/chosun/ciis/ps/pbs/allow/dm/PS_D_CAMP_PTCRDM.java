/***************************************************************************************************
* ���ϸ� : SP_PS_D_CAMP_PTCR.java
* ����-ķ���ΰ��� ķ���� ����ȭ��
* �ۼ����� : 2004-03-08
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.ds.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * ����-ķ���ΰ��� ķ���λ���
 *
 */ 

  

public class PS_D_CAMP_PTCRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String cambocdarr;
	public String campseqarr;

	public PS_D_CAMP_PTCRDM(){}
	public PS_D_CAMP_PTCRDM(String cmpycd, String incmgpers, String cambocdarr, String campseqarr){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.cambocdarr = cambocdarr;
		this.campseqarr = campseqarr;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setCambocdarr(String cambocdarr){
		this.cambocdarr = cambocdarr;
	}

	public void setCampseqarr(String campseqarr){
		this.campseqarr = campseqarr;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getCambocdarr(){
		return this.cambocdarr;
	}

	public String getCampseqarr(){
		return this.campseqarr;
	}

	public String getSQL(){
		 return "{ call SP_PS_D_CAMP_PTCR( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_D_CAMP_PTCRDM dm = (PS_D_CAMP_PTCRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.cambocdarr);
		cstmt.setString(6, dm.campseqarr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.allow.ds.PS_D_CAMP_PTCRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String cambocdarr = req.getParameter("cambocdarr");
if( cambocdarr == null){
	System.out.println(this.toString+" : cambocdarr is null" );
}else{
	System.out.println(this.toString+" : cambocdarr is "+cambocdarr );
}
String campseqarr = req.getParameter("campseqarr");
if( campseqarr == null){
	System.out.println(this.toString+" : campseqarr is null" );
}else{
	System.out.println(this.toString+" : campseqarr is "+campseqarr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String cambocdarr = Util.checkString(req.getParameter("cambocdarr"));
String campseqarr = Util.checkString(req.getParameter("campseqarr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String cambocdarr = Util.Uni2Ksc(Util.checkString(req.getParameter("cambocdarr")));
String campseqarr = Util.Uni2Ksc(Util.checkString(req.getParameter("campseqarr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setCambocdarr(cambocdarr);
dm.setCampseqarr(campseqarr);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 11 12:43:14 KST 2004 */