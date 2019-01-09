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


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1220_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpt_rpt_idx;

	public TN_LNK_1220_DDM(){}
	public TN_LNK_1220_DDM(String cmpy_cd, String rcpt_rpt_idx){
		this.cmpy_cd = cmpy_cd;
		this.rcpt_rpt_idx = rcpt_rpt_idx;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpt_rpt_idx(String rcpt_rpt_idx){
		this.rcpt_rpt_idx = rcpt_rpt_idx;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpt_rpt_idx(){
		return this.rcpt_rpt_idx;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_1220_D(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1220_DDM dm = (TN_LNK_1220_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpt_rpt_idx);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1220_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpt_rpt_idx = [" + getRcpt_rpt_idx() + "]");
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
String rcpt_rpt_idx = req.getParameter("rcpt_rpt_idx");
if( rcpt_rpt_idx == null){
	System.out.println(this.toString+" : rcpt_rpt_idx is null" );
}else{
	System.out.println(this.toString+" : rcpt_rpt_idx is "+rcpt_rpt_idx );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpt_rpt_idx = Util.checkString(req.getParameter("rcpt_rpt_idx"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpt_rpt_idx = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_rpt_idx")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpt_rpt_idx(rcpt_rpt_idx);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Sep 30 14:06:40 KST 2016 */