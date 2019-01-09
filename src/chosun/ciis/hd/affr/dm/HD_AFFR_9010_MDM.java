/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9010_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String usag_clsf_cd;

	public HD_AFFR_9010_MDM(){}
	public HD_AFFR_9010_MDM(String cmpy_cd, String usag_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.usag_clsf_cd = usag_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUsag_clsf_cd(String usag_clsf_cd){
		this.usag_clsf_cd = usag_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUsag_clsf_cd(){
		return this.usag_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9010_M(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9010_MDM dm = (HD_AFFR_9010_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.usag_clsf_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9010_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("usag_clsf_cd = [" + getUsag_clsf_cd() + "]");
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
String usag_clsf_cd = req.getParameter("usag_clsf_cd");
if( usag_clsf_cd == null){
	System.out.println(this.toString+" : usag_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : usag_clsf_cd is "+usag_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String usag_clsf_cd = Util.checkString(req.getParameter("usag_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String usag_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("usag_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setUsag_clsf_cd(usag_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 19 13:47:40 KST 2016 */