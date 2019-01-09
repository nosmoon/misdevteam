/***************************************************************************************************
* ���ϸ� : SE_SND_2420_LDM.java
* ��� : �Ǹ�-�߼۰���-���۴ܰ�����
* �ۼ����� : 2009-02-19
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


public class SE_SND_2420_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String tran_uprc_cd	;
	public String aply_dt		;
	public String incmg_pers	;

	public SE_SND_2420_LDM(){}
	public SE_SND_2420_LDM(String cmpy_cd, String tran_uprc_cd, String aply_dt, String incmg_pers){
		this.cmpy_cd 		= cmpy_cd		;
		this.tran_uprc_cd	= tran_uprc_cd	;
		this.aply_dt		= aply_dt		;
		this.incmg_pers 	= incmg_pers	;
	}

	
	public String getSQL(){
		 return "{ call SP_SE_SND_2420_L( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2420_LDM dm = (SE_SND_2420_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd		);
		cstmt.setString(4, dm.tran_uprc_cd	);
		cstmt.setString(5, dm.aply_dt		);
		cstmt.setString(6, dm.incmg_pers	);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2420_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("tran_uprc_cd 	= " + getTran_uprc_cd	());
        System.out.println("aply_dt		 	= " + getAply_dt		());
        System.out.println("incmg_pers 		= " + getIncmg_pers		());
    }
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getTran_uprc_cd() {
		return tran_uprc_cd;
	}
	public void setTran_uprc_cd(String tran_uprc_cd) {
		this.tran_uprc_cd = tran_uprc_cd;
	}
	public String getAply_dt() {
		return aply_dt;
	}
	public void setAply_dt(String aply_dt) {
		this.aply_dt = aply_dt;
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
String chg_reg_dt = req.getParameter("chg_reg_dt");
if( chg_reg_dt == null){
	System.out.println(this.toString+" : chg_reg_dt is null" );
}else{
	System.out.println(this.toString+" : chg_reg_dt is "+chg_reg_dt );
}
String chg_no = req.getParameter("chg_no");
if( chg_no == null){
	System.out.println(this.toString+" : chg_no is null" );
}else{
	System.out.println(this.toString+" : chg_no is "+chg_no );
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
String chg_reg_dt = Util.checkString(req.getParameter("chg_reg_dt"));
String chg_no = Util.checkString(req.getParameter("chg_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chg_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_reg_dt")));
String chg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setChg_reg_dt(chg_reg_dt);
dm.setChg_no(chg_no);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 19 17:42:17 KST 2009 */