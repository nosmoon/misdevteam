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


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1202_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_no_list;

	public AS_ASET_1202_LDM(){}
	public AS_ASET_1202_LDM(String cmpy_cd, String aset_no_list){
		this.cmpy_cd = cmpy_cd;
		this.aset_no_list = aset_no_list;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAset_no_list(String aset_no_list){
		this.aset_no_list = aset_no_list;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAset_no_list(){
		return this.aset_no_list;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1202_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1202_LDM dm = (AS_ASET_1202_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aset_no_list);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1202_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("aset_no_list = " + getAset_no_list());
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
String aset_no_list = req.getParameter("aset_no_list");
if( aset_no_list == null){
	System.out.println(this.toString+" : aset_no_list is null" );
}else{
	System.out.println(this.toString+" : aset_no_list is "+aset_no_list );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aset_no_list = Util.checkString(req.getParameter("aset_no_list"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aset_no_list = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no_list")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setAset_no_list(aset_no_list);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 11 19:03:11 KST 2009 */