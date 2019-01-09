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


package chosun.ciis.as.com.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.com.ds.*;
import chosun.ciis.as.com.rec.*;

/**
 * 
 */


public class AS_COM_1600_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String srch_aset_no;

	public AS_COM_1600_LDM(){}
	public AS_COM_1600_LDM(String cmpy_cd, String srch_aset_no){
		this.cmpy_cd = cmpy_cd;
		this.srch_aset_no = srch_aset_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSrch_aset_no(String srch_aset_no){
		this.srch_aset_no = srch_aset_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSrch_aset_no(){
		return this.srch_aset_no;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_COM_1600_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_COM_1600_LDM dm = (AS_COM_1600_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.srch_aset_no);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.com.ds.AS_COM_1600_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("srch_aset_no = " + getSrch_aset_no());
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
String srch_aset_no = req.getParameter("srch_aset_no");
if( srch_aset_no == null){
	System.out.println(this.toString+" : srch_aset_no is null" );
}else{
	System.out.println(this.toString+" : srch_aset_no is "+srch_aset_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String srch_aset_no = Util.checkString(req.getParameter("srch_aset_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String srch_aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_aset_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSrch_aset_no(srch_aset_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 02 11:56:04 KST 2009 */