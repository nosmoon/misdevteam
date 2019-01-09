/***************************************************************************************************
* ���ϸ� : .java
* ��� : ȸ�����
* �ۼ����� : 2009-02-19
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * ȸ�����
 */


public class FC_ACCT_2841_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_shet_kind;
	public String rcpm_shet_dlv_dt_fr;
	public String rcpm_shet_dlv_dt_to;
	public String rcpm_shet_stat;

	public FC_ACCT_2841_LDM(){}
	public FC_ACCT_2841_LDM(String cmpy_cd, String rcpm_shet_kind, String rcpm_shet_dlv_dt_fr, String rcpm_shet_dlv_dt_to, String rcpm_shet_stat){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_shet_kind = rcpm_shet_kind;
		this.rcpm_shet_dlv_dt_fr = rcpm_shet_dlv_dt_fr;
		this.rcpm_shet_dlv_dt_to = rcpm_shet_dlv_dt_to;
		this.rcpm_shet_stat = rcpm_shet_stat;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_dlv_dt_fr(String rcpm_shet_dlv_dt_fr){
		this.rcpm_shet_dlv_dt_fr = rcpm_shet_dlv_dt_fr;
	}

	public void setRcpm_shet_dlv_dt_to(String rcpm_shet_dlv_dt_to){
		this.rcpm_shet_dlv_dt_to = rcpm_shet_dlv_dt_to;
	}

	public void setRcpm_shet_stat(String rcpm_shet_stat){
		this.rcpm_shet_stat = rcpm_shet_stat;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_dlv_dt_fr(){
		return this.rcpm_shet_dlv_dt_fr;
	}

	public String getRcpm_shet_dlv_dt_to(){
		return this.rcpm_shet_dlv_dt_to;
	}

	public String getRcpm_shet_stat(){
		return this.rcpm_shet_stat;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2841_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2841_LDM dm = (FC_ACCT_2841_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_shet_kind);
		cstmt.setString(5, dm.rcpm_shet_dlv_dt_fr);
		cstmt.setString(6, dm.rcpm_shet_dlv_dt_to);
		cstmt.setString(7, dm.rcpm_shet_stat);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2841_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("rcpm_shet_kind = " + getRcpm_shet_kind());
        System.out.println("rcpm_shet_dlv_dt_fr = " + getRcpm_shet_dlv_dt_fr());
        System.out.println("rcpm_shet_dlv_dt_to = " + getRcpm_shet_dlv_dt_to());
        System.out.println("rcpm_shet_stat = " + getRcpm_shet_stat());
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
String rcpm_shet_kind = req.getParameter("rcpm_shet_kind");
if( rcpm_shet_kind == null){
	System.out.println(this.toString+" : rcpm_shet_kind is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_kind is "+rcpm_shet_kind );
}
String rcpm_shet_dlv_dt_fr = req.getParameter("rcpm_shet_dlv_dt_fr");
if( rcpm_shet_dlv_dt_fr == null){
	System.out.println(this.toString+" : rcpm_shet_dlv_dt_fr is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_dlv_dt_fr is "+rcpm_shet_dlv_dt_fr );
}
String rcpm_shet_dlv_dt_to = req.getParameter("rcpm_shet_dlv_dt_to");
if( rcpm_shet_dlv_dt_to == null){
	System.out.println(this.toString+" : rcpm_shet_dlv_dt_to is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_dlv_dt_to is "+rcpm_shet_dlv_dt_to );
}
String rcpm_shet_stat = req.getParameter("rcpm_shet_stat");
if( rcpm_shet_stat == null){
	System.out.println(this.toString+" : rcpm_shet_stat is null" );
}else{
	System.out.println(this.toString+" : rcpm_shet_stat is "+rcpm_shet_stat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_shet_kind = Util.checkString(req.getParameter("rcpm_shet_kind"));
String rcpm_shet_dlv_dt_fr = Util.checkString(req.getParameter("rcpm_shet_dlv_dt_fr"));
String rcpm_shet_dlv_dt_to = Util.checkString(req.getParameter("rcpm_shet_dlv_dt_to"));
String rcpm_shet_stat = Util.checkString(req.getParameter("rcpm_shet_stat"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_shet_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_kind")));
String rcpm_shet_dlv_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_dlv_dt_fr")));
String rcpm_shet_dlv_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_dlv_dt_to")));
String rcpm_shet_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_shet_stat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_shet_kind(rcpm_shet_kind);
dm.setRcpm_shet_dlv_dt_fr(rcpm_shet_dlv_dt_fr);
dm.setRcpm_shet_dlv_dt_to(rcpm_shet_dlv_dt_to);
dm.setRcpm_shet_stat(rcpm_shet_stat);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 03 20:38:33 KST 2009 */