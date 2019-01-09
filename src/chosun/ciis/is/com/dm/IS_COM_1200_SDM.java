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


package chosun.ciis.is.com.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.com.ds.*;
import chosun.ciis.is.com.rec.*;

/**
 * 
 */


public class IS_COM_1200_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_clsf_cd_seq;

	public IS_COM_1200_SDM(){}
	public IS_COM_1200_SDM(String cmpy_cd, String dlco_clsf_cd_seq){
		this.cmpy_cd = cmpy_cd;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_COM_1200_S(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_COM_1200_SDM dm = (IS_COM_1200_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_clsf_cd_seq);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.com.ds.IS_COM_1200_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
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
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 02 14:18:04 KST 2012 */