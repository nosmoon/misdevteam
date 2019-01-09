/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_4025_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pay_note_no;
	public String stat_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_4025_DDM(){}
	public FC_FUNC_4025_DDM(String cmpy_cd, String pay_note_no, String stat_cd, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.pay_note_no = pay_note_no;
		this.stat_cd = stat_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPay_note_no(String pay_note_no){
		this.pay_note_no = pay_note_no;
	}

	public void setStat_cd(String stat_cd){
		this.stat_cd = stat_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPay_note_no(){
		return this.pay_note_no;
	}

	public String getStat_cd(){
		return this.stat_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_4025_D(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_4025_DDM dm = (FC_FUNC_4025_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pay_note_no);
		cstmt.setString(5, dm.stat_cd);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_4025_DDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("pay_note_no = " + getPay_note_no());
        System.out.println("stat_cd = " + getStat_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
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
String pay_note_no = req.getParameter("pay_note_no");
if( pay_note_no == null){
	System.out.println(this.toString+" : pay_note_no is null" );
}else{
	System.out.println(this.toString+" : pay_note_no is "+pay_note_no );
}
String stat_cd = req.getParameter("stat_cd");
if( stat_cd == null){
	System.out.println(this.toString+" : stat_cd is null" );
}else{
	System.out.println(this.toString+" : stat_cd is "+stat_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pay_note_no = Util.checkString(req.getParameter("pay_note_no"));
String stat_cd = Util.checkString(req.getParameter("stat_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pay_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_note_no")));
String stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setPay_note_no(pay_note_no);
dm.setStat_cd(stat_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 06 15:26:35 KST 2009 */