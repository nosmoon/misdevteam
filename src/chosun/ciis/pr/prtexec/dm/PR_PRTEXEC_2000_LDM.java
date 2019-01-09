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


package chosun.ciis.pr.prtexec.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.ds.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_2000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_yymm;

	public PR_PRTEXEC_2000_LDM(){}
	public PR_PRTEXEC_2000_LDM(String cmpy_cd, String occr_yymm){
		this.cmpy_cd = cmpy_cd;
		this.occr_yymm = occr_yymm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_yymm(String occr_yymm){
		this.occr_yymm = occr_yymm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_yymm(){
		return this.occr_yymm;
	}

	public String getSQL(){
		 return "{ call SP_PR_PRTEXEC_2000_L( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_2000_LDM dm = (PR_PRTEXEC_2000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_yymm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_2000_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_yymm = " + getOccr_yymm());
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
String occr_yymm = req.getParameter("occr_yymm");
if( occr_yymm == null){
	System.out.println(this.toString+" : occr_yymm is null" );
}else{
	System.out.println(this.toString+" : occr_yymm is "+occr_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_yymm = Util.checkString(req.getParameter("occr_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_yymm(occr_yymm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 11 22:36:34 KST 2009 */