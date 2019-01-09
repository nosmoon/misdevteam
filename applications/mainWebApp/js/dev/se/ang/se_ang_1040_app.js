//테스트
var app = angular.module('1040', ['ngAnimate', 'ngTouch', 'ui.grid', 'ui.grid.pinning', 'ui.grid.moveColumns', 'ui.grid.resizeColumns', 'ui.grid.exporter', 'ui.grid.pagination', 'ui.grid.selection']);
/*--------------------------------

app.config(function ($httpProvider,$httpParamSerializerJQLikeProvider){
	$httpProvider.defaults.transformRequest.unshift($httpParamSerializerJQLikeProvider.$get());
});
--------------------------------*/


app.directive('krInput', ['$parse', function($parse) {
    return {
        priority : 2,
        restrict : 'A',
        compile : function(element) {
            element.on('compositionstart', function(e) {
                e.stopImmediatePropagation();
	            });
        },
    };
}]);

 
app.controller('ctrl1040', ['$scope', '$http', '$timeout', '$interval', 'uiGridConstants', 'exportUiGridService', function($scope, $http, $timeout, $interval, uiGridConstants, exportUiGridService ) {
	
	// ??? ????
	$scope.title  = "테스트 Sample";
	$scope.code   = {};
	$scope.detail = {};
	$scope.totalcnt = 0;
	$scope.code.fryymm = "201701";
	$scope.code.toyymm = "201712";


	// GRID ???????
	$scope.gridOptions1 = {
		data:				'gridData',
		rowHeight:			26,
		flatEntityAcess:	true,
		fastWatch:			true,
		getRowIdentity: 	getRowId,
// importerDataAddCallback: function importerDataAddCallback( grid, newObjects )
// {
// $scope.gridData = $scope.data.concat( newObjects );
// },
		multiSelect:		true,
		enableSelectAll: 	true,
		enableFullRowSelection:	true,
		selectionRowHeaderWidth: 35,		
		// Filtering
		enableFiltering:	false,
		// Footer
		showGridFooter:		true,
		// Paging
		paginationPageSizes: [10, 15, 20, 50, 80, 100],
		paginationPageSize:	 15,
		// Sort
		enableSorting:		true,
		// Handlers, Template
		appScopeProvider:	{
			onGridDblClick : function(row) {
			/*
			 * $scope.detail.dept_nm = row.entity.dept_nm; $scope.detail.part_nm =
			 * row.entity.part_nm; $scope.detail.area_nm = row.entity.area_nm;
			 * $scope.detail.bo_cd = row.entity.bo_cd; $scope.detail.bo_nm =
			 * row.entity.bo_nm; $scope.detail.bo_seq = row.entity.bo_seq;
			 * $scope.detail.qty = row.entity.qty; $scope.detail.uprc =
			 * row.entity.uprc; $scope.detail.amt = row.entity.amt;
			 * $scope.detail.dept_cd = row.entity.dept_cd; $scope.detail.part_cd =
			 * row.entity.part_cd; $scope.detail.area_cd = row.entity.area_cd;
			 */
			}
		},
		rowTemplate:		'<div ng-dblclick="grid.appScope.onGridDblClick(row)" ng-repeat="col in colContainer.renderedColumns track by col.colDef.name" class="ui-grid-cell" ui-grid-cell></div>',
		// Export data
		enableGridMenu:			true,
		exporterMenuPdf:		false,
		exporterMenuCsv:		false,
		// exporterCsvFilename: 'sample.csv',
	    // exporterCsvLinkElement:
		// angular.element(document.querySelectorAll(".custom-csv-link-location")),
		

        gridMenuCustomItems: [
        		{
        			title: '??u??? ????????',
            		action: function ($event) {
								exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'all', 'all');
                	},
                    order: 110
                },
                {
                    title: '?????? ??????? ????????',
                    action: function ($event) {
                        		exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'visible', 'visible');
                    },
                    order: 111
                },
                {
                    title: '???o??? ????????',
                    action: function ($event) {
                        		exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'selected', 'visible');
                    },
                    order: 112
                }
		]
	};

	
	// GRID
	$scope.gridOptions1.columnDefs = [
			  { name:'센터코드', 	field: 'bocd' , 		width:80 }, 
			  { name:'년월', 	field: 'subsmappli' ,	width:80 }, 
			  { name:'매체',    	field: 'medinm' , 		width:80 }, 
  			  { name:'매체코드', 	field: 'medicd' , 		width:80 }, 
			  { name:'수금방법',	field: 'clamtnm' , 		width:80 }, 
  			  { name:'수금방법코드',	field: 'clamtmthdcd', 	width:80 },
			  { name:'입금방법',	field: 'rcpmnm', 		width:100 },
			  { name:'입금방법보크',	field: 'rcpmclsfcd', 	width:100 },
			  { name:'부수',		field: 'clamqty', 		width:100, cellFilter: 'number'  },
			  { name:'금액',		field: 'clamt', 		width:100, cellFilter: 'number'  }
		]
	;
	
	
	// GRID API
	$scope.gridOptions1.onRegisterApi = function(gridApi) {
      $scope.gridApi = gridApi;
    };

	function getRowId(row) {
    	return row.id;
  	}


	$http.get("/se/ang/1040").then(function (response) {
        $scope.bo_list = response.data.root.dataSet.bo_cdcur.record;
        $scope.medi_list = response.data.root.dataSet.medi_cdcur.record;
        $scope.clamtmthd_list = response.data.root.dataSet.clamtmthd_cdcur.record;
    });


    $scope.chg1 = function() {
    	// alert($scope.code.bo_cd);
    };


    $scope.chg2 = function() {
    	// alert($scope.code.medi_cd);
    };


    $scope.chg3 = function() {
    	// alert($scope.code.clamtmthd_cd);
    };

	
	
    $scope.search = function() {
    	$scope.gridData = [];
    	var start = 0;
    	var inc   = 10000;
    	
		$scope.result = "";	// ????? ???? ????
    	
    	if($scope.code.fryymm == "") {
    		alert("?????????");
    		return;
    	}
    	
    	if($scope.code.toyymm == "") {
    		alert("????????? nn");
    		return;
    	}
   
    	
    	// showProgress(); //progress ??????
    	
    	var i = 0;
    	// 500msec ???? $interval ????, 10?? ???, sec?? ????
    	// var sec = $interval(function() {
    		   	   	
    	   	$scope.code.start = start;
    		$scope.code.end   = start + inc;
    		start = $scope.code.end + 1;
    		
			$http({
				method  : 'POST',
				url     : '/se/ang/1041', 
				data    : $.param($scope.code),
				headers : { 'Content-Type': 'application/x-www-form-urlencoded' }			
			}).success(function(data, status) {
			    $scope.totalcnt += data.root.gridData.totalcnt;
				// $scope.result = data; //.root.gridData.record;
				// $scope.gridOptions1.data = data.root.gridData.record;

			    if( data.root.gridData.totalcnt == 0 ) {
					// $scope.gridOptions1.data = [];
					//$interval.cancel(sec);
			    }

			    //alert(data.root.gridData.length);
			    //alert(data.root.gridData.totalcnt + " : " + data.root.gridData.length);
				//alert(data.root.gridData);
			    
			    data.root.gridData.forEach(function(rows) {			    				    
			    	var record = rows;
			    	//alert(record);
			    	//alert(JSON.stringfy(record));
			    	
			    	
//			    	i++; 
//			    	row.registered = new Date(row.registered)
//			    	row.id = i;

			   
			    	/*
			    	for(var i=0; i<record.length; i++) {
			    		var rec = record[i];
			    		var a = rec;
			    	}
			    	*/
			    	
			    	record.record.forEach(function(row) {
			    		//var rec = row;
			    		//rec = rec;
			    		$scope.gridData.push(row);
			    	});


			    	/*
			    	rows.forEach(function(row) {
			    		var rec= row;
			    		rec = rec;
//			    		$scope.gridData.puch(row);
			    	});
			    	*/
			    });
				/*
				 * data.root.gridData.record.forEach(function(row){ row.id = i;
				 * i++; row.registered = new Date(row.registered)
				 * $scope.gridData.push(row); });
				 */
				//$scope.result = $scope.gridData;
				// hideProgress(); //progress ????
			})
			.error(function() {
	          alert("error");
	        });
		// }, 1000, 10);
		
/*
 * //2000msec ?Ŀ? $interval ????????? $interval ?? var timeout =
 * $timeout(function() { $interval.cancel(sec); }, 5000);
 */		
		// ????? ???????? $timeout, $interval ????
		$scope.$on('$destroy', function(){
			// $timeout.cancel(timeout);
	      	$interval.cancel(sec);
	    });
	    
    };

    
	// ???? ??? ??? ?? ???? ???
	$scope.toggleFiltering = function() {
		$scope.gridOptions1.enableFiltering = !$scope.gridOptions1.enableFiltering;
		$scope.gridApi.core.notifyDataChange( uiGridConstants.dataChange.COLUMN );
	};
	
	// Excel ??? ??? ?? ???? ???
	$scope.excel = function() {
		exportUiGridService.exportToExcel('sheet 1', $scope.gridApi, 'all', 'all');
	};


	$scope.toggleInstance = function() {
		$("#textarea1").toggle();k
	};


	$scope.selectedData = function() {		
		var rows = $scope.gridApi.selection.getSelectedRows();
		var data = "[";
		angular.forEach(rows, function(row, rowkey) {
			data += "{";
			angular.forEach(row, function(colval, colkey) {
				data += "\"" + colkey + "\":\"" + colval + "\",";
			});			
			data += "\":\"},";
		});
		data = data.substring(0, data.length - 1) + "]";
		alert(data);
	};


	$scope.insert = function() {		
		if($scope.detail.bo_cd == null || $scope.detail.bo_nm == null || $scope.detail.bo_seq == null ||
			$scope.detail.bo_cd == "" || $scope.detail.bo_nm == "" || $scope.detail.bo_seq == "" ) {
			return;
		}
		$scope.detail.clsf = "I";
		$scope.process();
	};
	


	$scope.update = function() {
		if($scope.detail.bo_cd == "" || $scope.detail.bo_cd == null) {
			return;
		}
		$scope.detail.clsf = "U";
		$scope.process();
	};
	


	$scope.delete = function() {
		if($scope.detail.bo_cd == "" || $scope.detail.bo_cd == null) {
			return;
		}
		$scope.detail.clsf = "D";
		$scope.process();
	};
	

	
	$scope.init = function() {
		$scope.detail = {};
	};
	
	$scope.process = function() {

		$http({
			method  : 'POST',
			url     : '/se/ang/1030',
			data    : $.param($scope.detail),
			headers : { 'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8' }
		}).success(function(data, status) {
		    // ???? ?? o??
		    alert("complete");
		    $scope.init();
		    $scope.search();
		});
	};
	
}])
;
