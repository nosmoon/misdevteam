/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.16
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_3721_SCURLISTRecord;

/**
 * 
 */


public class AD_BAS_3721_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable
{
	public ArrayList curlist 	= new ArrayList();
	public String errcode;
	public String errmsg;
	public String asum_pubc_amt;
	public String advt_ocpy_rate;
	
	public AD_BAS_3721_SDataSet(){}
	
	
	public String getAdvt_ocpy_rate() {
		return advt_ocpy_rate;
	}


	public void setAdvt_ocpy_rate(String advt_ocpy_rate) {
		this.advt_ocpy_rate = advt_ocpy_rate;
	}


	public String getAsum_pubc_amt() {
		return asum_pubc_amt;
	}


	public void setAsum_pubc_amt(String asum_pubc_amt) {
		this.asum_pubc_amt = asum_pubc_amt;
	}


	public ArrayList getCurlist() {
		return curlist;
	}


	public void setCurlist(ArrayList curlist) {
		this.curlist = curlist;
	}


	public String getErrcode() {
		return errcode;
	}


	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}


	public String getErrmsg() {
		return errmsg;
	}


	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}


	public void getValues(CallableStatement cstmt) throws SQLException
	{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){		return;		}
		
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next())
		{
			AD_BAS_3721_SCURLISTRecord rec = new AD_BAS_3721_SCURLISTRecord();
			rec.seq 			= Util.checkString(rset0.getString("seq"));
			rec.sect_nm_cd 		= Util.checkString(rset0.getString("sect_nm_cd"));
			rec.sect_nm_detail 	= Util.checkString(rset0.getString("sect_nm_detail"));
			rec.sect_cd 		= Util.checkString(rset0.getString("sect_cd"));
			rec.tot_pcnt	 	= Util.checkString(rset0.getString("tot_pcnt"));
			rec.tot_dn 			= Util.checkString(rset0.getString("tot_dn"));
			rec.tot_clr_dn 		= Util.checkString(rset0.getString("tot_clr_dn"));
			rec.tot_pubc_amt 	= Util.checkString(rset0.getString("tot_pubc_amt"));
			rec.advt_ocpy_rate 	= Util.checkString(rset0.getString("advt_ocpy_rate"));
			this.curlist.add(rec);
		}
		
		this.asum_pubc_amt 		= Util.checkString(cstmt.getString(7));
		this.advt_ocpy_rate		= Util.checkString(cstmt.getString(8));
	}	
}