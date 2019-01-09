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


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_3003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fundidx;
	public String fundcode;
	public String mode;

	public TN_BAS_3003_ADM(){}
	public TN_BAS_3003_ADM(String cmpy_cd, String fundidx, String fundcode, String mode){
		this.cmpy_cd = cmpy_cd;
		this.fundidx = fundidx;
		this.fundcode = fundcode;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFundidx(String fundidx){
		this.fundidx = fundidx;
	}

	public void setFundcode(String fundcode){
		this.fundcode = fundcode;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFundidx(){
		return this.fundidx;
	}

	public String getFundcode(){
		return this.fundcode;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_3003_A(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_3003_ADM dm = (TN_BAS_3003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fundidx);
		cstmt.setString(5, dm.fundcode);
		cstmt.setString(6, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_3003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fundidx = [" + getFundidx() + "]");
		System.out.println("fundcode = [" + getFundcode() + "]");
		System.out.println("mode = [" + getMode() + "]");
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
String fundidx = req.getParameter("fundidx");
if( fundidx == null){
	System.out.println(this.toString+" : fundidx is null" );
}else{
	System.out.println(this.toString+" : fundidx is "+fundidx );
}
String fundcode = req.getParameter("fundcode");
if( fundcode == null){
	System.out.println(this.toString+" : fundcode is null" );
}else{
	System.out.println(this.toString+" : fundcode is "+fundcode );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fundidx = Util.checkString(req.getParameter("fundidx"));
String fundcode = Util.checkString(req.getParameter("fundcode"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fundidx = Util.Uni2Ksc(Util.checkString(req.getParameter("fundidx")));
String fundcode = Util.Uni2Ksc(Util.checkString(req.getParameter("fundcode")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFundidx(fundidx);
dm.setFundcode(fundcode);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jul 21 17:11:16 KST 2016 */