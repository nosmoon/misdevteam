/***************************************************************************************************
* ���ϸ� : SE_SND_2310_LDM.java
* ��� : �Ǹ�-�߼۰���-���۾��ڵ��
* �ۼ����� : 2009-02-13
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String tran_cmpy_cd	;
	public String tran_cmpy_nm	;
	public String route_cd		;
	public String prt_plac_cd	;
	public String route_clsf	;
	public String use_yn		;
	public String incmg_pers	;

	public SE_SND_2310_LDM(){}
	public SE_SND_2310_LDM(String cmpy_cd, String tran_cmpy_cd, String tran_cmpy_nm, String route_cd, String prt_plac_cd, String route_clsf, String use_yn, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.tran_cmpy_cd	= tran_cmpy_cd	;
		this.tran_cmpy_nm	= tran_cmpy_nm	;
		this.route_cd 		= route_cd		;
		this.prt_plac_cd 	= prt_plac_cd	;
		this.route_clsf 	= route_clsf	;
		this.use_yn 		= use_yn		;
		this.incmg_pers 	= incmg_pers	;
	}

	public String getTran_cmpy_cd() {
		return tran_cmpy_cd;
	}
	public void setTran_cmpy_cd(String tran_cmpy_cd) {
		this.tran_cmpy_cd = tran_cmpy_cd;
	}
	public String getTran_cmpy_nm() {
		return tran_cmpy_nm;
	}
	public void setTran_cmpy_nm(String tran_cmpy_nm) {
		this.tran_cmpy_nm = tran_cmpy_nm;
	}
	
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_2310_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2310_LDM dm = (SE_SND_2310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd		);
		cstmt.setString( 4, dm.tran_cmpy_cd	);
		cstmt.setString( 5, dm.tran_cmpy_nm	);
		cstmt.setString( 6, dm.route_cd		);
		cstmt.setString( 7, dm.prt_plac_cd	);
		cstmt.setString( 8, dm.route_clsf	);
		cstmt.setString( 9, dm.use_yn		);
		cstmt.setString(10, dm.incmg_pers	);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2310_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd()		);
        System.out.println("tran_cmpy_cd 	= " + getTran_cmpy_cd()	);
        System.out.println("tran_cmpy_nm 	= " + getTran_cmpy_nm()	);
        System.out.println("route_cd 		= " + getRoute_cd()		);
        System.out.println("prt_plac_cd 	= " + getPrt_plac_cd()	);
        System.out.println("route_clsf 		= " + getRoute_clsf()	);
        System.out.println("use_yn 			= " + getUse_yn()		);
        System.out.println("incmg_pers 		= " + getIncmg_pers()	);
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
String route_cd = req.getParameter("route_cd");
if( route_cd == null){
	System.out.println(this.toString+" : route_cd is null" );
}else{
	System.out.println(this.toString+" : route_cd is "+route_cd );
}
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRoute_cd(route_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setRoute_clsf(route_clsf);
dm.setUse_yn(use_yn);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 13 14:29:43 KST 2009 */