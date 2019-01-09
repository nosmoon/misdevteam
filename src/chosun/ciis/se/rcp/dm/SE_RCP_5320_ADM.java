/***************************************************************************************************
* ���ϸ� : SE_SAL_1820_ADM.java
* ��� : �Ǹ� - ������� - ������� - ���⸶��
* �ۼ����� : 2009-04-13
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.rcp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.ds.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_5320_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String yymm			;
	public String clos_yn		;
	public String clos_gbn		;
	public String incmg_pers	;
	public String incmg_pers_ip	;

	public SE_RCP_5320_ADM(){}
	public SE_RCP_5320_ADM(String cmpy_cd, String yymm, String clos_yn, String clos_gbn, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd 		= cmpy_cd		;
		this.yymm 			= yymm			;
		this.clos_yn 		= clos_yn		;
		this.clos_gbn 		= clos_gbn		;
		this.incmg_pers 	= incmg_pers	;
		this.incmg_pers_ip 	= incmg_pers_ip	;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_gbn(String clos_gbn){
		this.clos_gbn = clos_gbn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_gbn(){
		return this.clos_gbn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_RCP_5320_A( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_5320_ADM dm = (SE_RCP_5320_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd		);
		cstmt.setString(4, dm.yymm			);
		cstmt.setString(5, dm.clos_yn		);
		cstmt.setString(6, dm.clos_gbn		);
		cstmt.setString(7, dm.incmg_pers	);
		cstmt.setString(8, dm.incmg_pers_ip	);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_5320_ADataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("yymm 			= " + getYymm			());
        System.out.println("clos_yn 		= " + getClos_yn		());
        System.out.println("clos_gbn 		= " + getClos_gbn		());
        System.out.println("incmg_pers 		= " + getIncmg_pers		());
        System.out.println("incmg_pers_ip 	= " + getIncmg_pers_ip	());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String clos_gbn = req.getParameter("clos_gbn");
if( clos_gbn == null){
	System.out.println(this.toString+" : clos_gbn is null" );
}else{
	System.out.println(this.toString+" : clos_gbn is "+clos_gbn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String clos_gbn = Util.checkString(req.getParameter("clos_gbn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String clos_gbn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_gbn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setClos_yn(clos_yn);
dm.setClos_gbn(clos_gbn);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 13 15:57:09 KST 2009 */