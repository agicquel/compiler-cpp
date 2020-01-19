!function(e,t){"object"==typeof exports&&"undefined"!=typeof module?module.exports=t():"function"==typeof define&&define.amd?define(t):(e=e||self).i18next=t()}(this,function(){"use strict";function e(t){return(e="function"==typeof Symbol&&"symbol"==typeof Symbol.iterator?function(e){return typeof e}:function(e){return e&&"function"==typeof Symbol&&e.constructor===Symbol&&e!==Symbol.prototype?"symbol":typeof e})(t)}function t(n){return(t="function"==typeof Symbol&&"symbol"===e(Symbol.iterator)?function(t){return e(t)}:function(t){return t&&"function"==typeof Symbol&&t.constructor===Symbol&&t!==Symbol.prototype?"symbol":e(t)})(n)}function n(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function o(e){for(var t=1;t<arguments.length;t++){var o=null!=arguments[t]?arguments[t]:{},i=Object.keys(o);"function"==typeof Object.getOwnPropertySymbols&&(i=i.concat(Object.getOwnPropertySymbols(o).filter(function(e){return Object.getOwnPropertyDescriptor(o,e).enumerable}))),i.forEach(function(t){n(e,t,o[t])})}return e}function i(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function r(e,t){for(var n=0;n<t.length;n++){var o=t[n];o.enumerable=o.enumerable||!1,o.configurable=!0,"value"in o&&(o.writable=!0),Object.defineProperty(e,o.key,o)}}function a(e,t,n){return t&&r(e.prototype,t),n&&r(e,n),e}function s(e){if(void 0===e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return e}function u(e,n){return!n||"object"!==t(n)&&"function"!=typeof n?s(e):n}function l(e){return(l=Object.setPrototypeOf?Object.getPrototypeOf:function(e){return e.__proto__||Object.getPrototypeOf(e)})(e)}function c(e,t){return(c=Object.setPrototypeOf||function(e,t){return e.__proto__=t,e})(e,t)}function f(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function");e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,writable:!0,configurable:!0}}),t&&c(e,t)}function p(e){return function(e){if(Array.isArray(e)){for(var t=0,n=new Array(e.length);t<e.length;t++)n[t]=e[t];return n}}(e)||function(e){if(Symbol.iterator in Object(e)||"[object Arguments]"===Object.prototype.toString.call(e))return Array.from(e)}(e)||function(){throw new TypeError("Invalid attempt to spread non-iterable instance")}()}var g={type:"logger",log:function(e){this.output("log",e)},warn:function(e){this.output("warn",e)},error:function(e){this.output("error",e)},output:function(e,t){var n;console&&console[e]&&(n=console)[e].apply(n,p(t))}},h=new(function(){function e(t){var n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};i(this,e),this.init(t,n)}return a(e,[{key:"init",value:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};this.prefix=t.prefix||"i18next:",this.logger=e||g,this.options=t,this.debug=t.debug}},{key:"setDebug",value:function(e){this.debug=e}},{key:"log",value:function(){for(var e=arguments.length,t=new Array(e),n=0;n<e;n++)t[n]=arguments[n];return this.forward(t,"log","",!0)}},{key:"warn",value:function(){for(var e=arguments.length,t=new Array(e),n=0;n<e;n++)t[n]=arguments[n];return this.forward(t,"warn","",!0)}},{key:"error",value:function(){for(var e=arguments.length,t=new Array(e),n=0;n<e;n++)t[n]=arguments[n];return this.forward(t,"error","")}},{key:"deprecate",value:function(){for(var e=arguments.length,t=new Array(e),n=0;n<e;n++)t[n]=arguments[n];return this.forward(t,"warn","WARNING DEPRECATED: ",!0)}},{key:"forward",value:function(e,t,n,o){return o&&!this.debug?null:("string"==typeof e[0]&&(e[0]="".concat(n).concat(this.prefix," ").concat(e[0])),this.logger[t](e))}},{key:"create",value:function(t){return new e(this.logger,o({},{prefix:"".concat(this.prefix,":").concat(t,":")},this.options))}}]),e}()),d=function(){function e(){i(this,e),this.observers={}}return a(e,[{key:"on",value:function(e,t){var n=this;return e.split(" ").forEach(function(e){n.observers[e]=n.observers[e]||[],n.observers[e].push(t)}),this}},{key:"off",value:function(e,t){this.observers[e]&&(t?this.observers[e]=this.observers[e].filter(function(e){return e!==t}):delete this.observers[e])}},{key:"emit",value:function(e){for(var t=arguments.length,n=new Array(t>1?t-1:0),o=1;o<t;o++)n[o-1]=arguments[o];this.observers[e]&&[].concat(this.observers[e]).forEach(function(e){e.apply(void 0,n)});this.observers["*"]&&[].concat(this.observers["*"]).forEach(function(t){t.apply(t,[e].concat(n))})}}]),e}();function v(){var e,t,n=new Promise(function(n,o){e=n,t=o});return n.resolve=e,n.reject=t,n}function y(e){return null==e?"":""+e}function m(e,t,n){function o(e){return e&&e.indexOf("###")>-1?e.replace(/###/g,"."):e}function i(){return!e||"string"==typeof e}for(var r="string"!=typeof t?[].concat(t):t.split(".");r.length>1;){if(i())return{};var a=o(r.shift());!e[a]&&n&&(e[a]=new n),e=e[a]}return i()?{}:{obj:e,k:o(r.shift())}}function b(e,t,n){var o=m(e,t,Object);o.obj[o.k]=n}function k(e,t){var n=m(e,t),o=n.obj,i=n.k;if(o)return o[i]}function x(e,t,n){var o=k(e,n);return void 0!==o?o:k(t,n)}function w(e){return e.replace(/[\-\[\]\/\{\}\(\)\*\+\?\.\\\^\$\|]/g,"\\$&")}var S={"&":"&amp;","<":"&lt;",">":"&gt;",'"':"&quot;","'":"&#39;","/":"&#x2F;"};function O(e){return"string"==typeof e?e.replace(/[&<>"'\/]/g,function(e){return S[e]}):e}var L=function(e){function t(e){var n,o=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{ns:["translation"],defaultNS:"translation"};return i(this,t),n=u(this,l(t).call(this)),d.call(s(n)),n.data=e||{},n.options=o,void 0===n.options.keySeparator&&(n.options.keySeparator="."),n}return f(t,d),a(t,[{key:"addNamespaces",value:function(e){this.options.ns.indexOf(e)<0&&this.options.ns.push(e)}},{key:"removeNamespaces",value:function(e){var t=this.options.ns.indexOf(e);t>-1&&this.options.ns.splice(t,1)}},{key:"getResource",value:function(e,t,n){var o=arguments.length>3&&void 0!==arguments[3]?arguments[3]:{},i=void 0!==o.keySeparator?o.keySeparator:this.options.keySeparator,r=[e,t];return n&&"string"!=typeof n&&(r=r.concat(n)),n&&"string"==typeof n&&(r=r.concat(i?n.split(i):n)),e.indexOf(".")>-1&&(r=e.split(".")),k(this.data,r)}},{key:"addResource",value:function(e,t,n,o){var i=arguments.length>4&&void 0!==arguments[4]?arguments[4]:{silent:!1},r=this.options.keySeparator;void 0===r&&(r=".");var a=[e,t];n&&(a=a.concat(r?n.split(r):n)),e.indexOf(".")>-1&&(o=t,t=(a=e.split("."))[1]),this.addNamespaces(t),b(this.data,a,o),i.silent||this.emit("added",e,t,n,o)}},{key:"addResources",value:function(e,t,n){var o=arguments.length>3&&void 0!==arguments[3]?arguments[3]:{silent:!1};for(var i in n)"string"!=typeof n[i]&&"[object Array]"!==Object.prototype.toString.apply(n[i])||this.addResource(e,t,i,n[i],{silent:!0});o.silent||this.emit("added",e,t,n)}},{key:"addResourceBundle",value:function(e,t,n,i,r){var a=arguments.length>5&&void 0!==arguments[5]?arguments[5]:{silent:!1},s=[e,t];e.indexOf(".")>-1&&(i=n,n=t,t=(s=e.split("."))[1]),this.addNamespaces(t);var u=k(this.data,s)||{};i?function e(t,n,o){for(var i in n)i in t?"string"==typeof t[i]||t[i]instanceof String||"string"==typeof n[i]||n[i]instanceof String?o&&(t[i]=n[i]):e(t[i],n[i],o):t[i]=n[i];return t}(u,n,r):u=o({},u,n),b(this.data,s,u),a.silent||this.emit("added",e,t,n)}},{key:"removeResourceBundle",value:function(e,t){this.hasResourceBundle(e,t)&&delete this.data[e][t],this.removeNamespaces(t),this.emit("removed",e,t)}},{key:"hasResourceBundle",value:function(e,t){return void 0!==this.getResource(e,t)}},{key:"getResourceBundle",value:function(e,t){return t||(t=this.options.defaultNS),"v1"===this.options.compatibilityAPI?o({},{},this.getResource(e,t)):this.getResource(e,t)}},{key:"getDataByLanguage",value:function(e){return this.data[e]}},{key:"toJSON",value:function(){return this.data}}]),t}(),R={processors:{},addPostProcessor:function(e){this.processors[e.name]=e},handle:function(e,t,n,o,i){var r=this;return e.forEach(function(e){r.processors[e]&&(t=r.processors[e].process(t,n,o,i))}),t}},N={},j=function(e){function n(e){var t,o,r,a,c=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};return i(this,n),t=u(this,l(n).call(this)),d.call(s(t)),o=["resourceStore","languageUtils","pluralResolver","interpolator","backendConnector","i18nFormat","utils"],r=e,a=s(t),o.forEach(function(e){r[e]&&(a[e]=r[e])}),t.options=c,void 0===t.options.keySeparator&&(t.options.keySeparator="."),t.logger=h.create("translator"),t}return f(n,d),a(n,[{key:"changeLanguage",value:function(e){e&&(this.language=e)}},{key:"exists",value:function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{interpolation:{}},n=this.resolve(e,t);return n&&void 0!==n.res}},{key:"extractFromKey",value:function(e,t){var n=t.nsSeparator||this.options.nsSeparator;void 0===n&&(n=":");var o=void 0!==t.keySeparator?t.keySeparator:this.options.keySeparator,i=t.ns||this.options.defaultNS;if(n&&e.indexOf(n)>-1){var r=e.split(n);(n!==o||n===o&&this.options.ns.indexOf(r[0])>-1)&&(i=r.shift()),e=r.join(o)}return"string"==typeof i&&(i=[i]),{key:e,namespaces:i}}},{key:"translate",value:function(e,n){var i=this;if("object"!==t(n)&&this.options.overloadTranslationOptionHandler&&(n=this.options.overloadTranslationOptionHandler(arguments)),n||(n={}),null==e)return"";Array.isArray(e)||(e=[String(e)]);var r=void 0!==n.keySeparator?n.keySeparator:this.options.keySeparator,a=this.extractFromKey(e[e.length-1],n),s=a.key,u=a.namespaces,l=u[u.length-1],c=n.lng||this.language,f=n.appendNamespaceToCIMode||this.options.appendNamespaceToCIMode;if(c&&"cimode"===c.toLowerCase()){if(f){var p=n.nsSeparator||this.options.nsSeparator;return l+p+s}return s}var g=this.resolve(e,n),h=g&&g.res,d=g&&g.usedKey||s,v=g&&g.exactUsedKey||s,y=Object.prototype.toString.apply(h),m=void 0!==n.joinArrays?n.joinArrays:this.options.joinArrays,b=!this.i18nFormat||this.i18nFormat.handleAsObject;if(b&&h&&("string"!=typeof h&&"boolean"!=typeof h&&"number"!=typeof h)&&["[object Number]","[object Function]","[object RegExp]"].indexOf(y)<0&&("string"!=typeof m||"[object Array]"!==y)){if(!n.returnObjects&&!this.options.returnObjects)return this.logger.warn("accessing an object - but returnObjects options is not enabled!"),this.options.returnedObjectHandler?this.options.returnedObjectHandler(d,h,n):"key '".concat(s," (").concat(this.language,")' returned an object instead of string.");if(r){var k="[object Array]"===y,x=k?[]:{},w=k?v:d;for(var S in h)if(Object.prototype.hasOwnProperty.call(h,S)){var O="".concat(w).concat(r).concat(S);x[S]=this.translate(O,o({},n,{joinArrays:!1,ns:u})),x[S]===O&&(x[S]=h[S])}h=x}}else if(b&&"string"==typeof m&&"[object Array]"===y)(h=h.join(m))&&(h=this.extendTranslation(h,e,n));else{var L=!1,R=!1;if(!this.isValidLookup(h)&&void 0!==n.defaultValue){if(L=!0,void 0!==n.count){var N=this.pluralResolver.getSuffix(c,n.count);h=n["defaultValue".concat(N)]}h||(h=n.defaultValue)}this.isValidLookup(h)||(R=!0,h=s);var j=n.defaultValue&&n.defaultValue!==h&&this.options.updateMissing;if(R||L||j){this.logger.log(j?"updateKey":"missingKey",c,l,s,j?n.defaultValue:h);var C=[],P=this.languageUtils.getFallbackCodes(this.options.fallbackLng,n.lng||this.language);if("fallback"===this.options.saveMissingTo&&P&&P[0])for(var E=0;E<P.length;E++)C.push(P[E]);else"all"===this.options.saveMissingTo?C=this.languageUtils.toResolveHierarchy(n.lng||this.language):C.push(n.lng||this.language);var F=function(e,t){i.options.missingKeyHandler?i.options.missingKeyHandler(e,l,t,j?n.defaultValue:h,j,n):i.backendConnector&&i.backendConnector.saveMissing&&i.backendConnector.saveMissing(e,l,t,j?n.defaultValue:h,j,n),i.emit("missingKey",e,l,t,h)};if(this.options.saveMissing){var T=void 0!==n.count&&"string"!=typeof n.count;this.options.saveMissingPlurals&&T?C.forEach(function(e){i.pluralResolver.getPluralFormsOfKey(e,s).forEach(function(t){return F([e],t)})}):F(C,s)}}h=this.extendTranslation(h,e,n,g),R&&h===s&&this.options.appendNamespaceToMissingKey&&(h="".concat(l,":").concat(s)),R&&this.options.parseMissingKeyHandler&&(h=this.options.parseMissingKeyHandler(h))}return h}},{key:"extendTranslation",value:function(e,t,n,i){var r=this;if(this.i18nFormat&&this.i18nFormat.parse)e=this.i18nFormat.parse(e,n,i.usedLng,i.usedNS,i.usedKey,{resolved:i});else if(!n.skipInterpolation){n.interpolation&&this.interpolator.init(o({},n,{interpolation:o({},this.options.interpolation,n.interpolation)}));var a=n.replace&&"string"!=typeof n.replace?n.replace:n;this.options.interpolation.defaultVariables&&(a=o({},this.options.interpolation.defaultVariables,a)),e=this.interpolator.interpolate(e,a,n.lng||this.language,n),!1!==n.nest&&(e=this.interpolator.nest(e,function(){return r.translate.apply(r,arguments)},n)),n.interpolation&&this.interpolator.reset()}var s=n.postProcess||this.options.postProcess,u="string"==typeof s?[s]:s;return null!=e&&u&&u.length&&!1!==n.applyPostProcessor&&(e=R.handle(u,e,t,this.options&&this.options.postProcessPassResolved?o({i18nResolved:i},n):n,this)),e}},{key:"resolve",value:function(e){var t,n,o,i,r,a=this,s=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};return"string"==typeof e&&(e=[e]),e.forEach(function(e){if(!a.isValidLookup(t)){var u=a.extractFromKey(e,s),l=u.key;n=l;var c=u.namespaces;a.options.fallbackNS&&(c=c.concat(a.options.fallbackNS));var f=void 0!==s.count&&"string"!=typeof s.count,p=void 0!==s.context&&"string"==typeof s.context&&""!==s.context,g=s.lngs?s.lngs:a.languageUtils.toResolveHierarchy(s.lng||a.language,s.fallbackLng);c.forEach(function(e){a.isValidLookup(t)||(r=e,!N["".concat(g[0],"-").concat(e)]&&a.utils&&a.utils.hasLoadedNamespace&&!a.utils.hasLoadedNamespace(r)&&(N["".concat(g[0],"-").concat(e)]=!0,a.logger.warn('key "'.concat(n,'" for namespace "').concat(r,'" for languages "').concat(g.join(", "),"\" won't get resolved as namespace was not yet loaded"),"This means something IS WRONG in your application setup. You access the t function before i18next.init / i18next.loadNamespace / i18next.changeLanguage was done. Wait for the callback or Promise to resolve before accessing it!!!")),g.forEach(function(n){if(!a.isValidLookup(t)){i=n;var r,u,c=l,g=[c];if(a.i18nFormat&&a.i18nFormat.addLookupKeys)a.i18nFormat.addLookupKeys(g,l,n,e,s);else f&&(r=a.pluralResolver.getSuffix(n,s.count)),f&&p&&g.push(c+r),p&&g.push(c+="".concat(a.options.contextSeparator).concat(s.context)),f&&g.push(c+=r);for(;u=g.pop();)a.isValidLookup(t)||(o=u,t=a.getResource(n,e,u,s))}}))})}}),{res:t,usedKey:n,exactUsedKey:o,usedLng:i,usedNS:r}}},{key:"isValidLookup",value:function(e){return!(void 0===e||!this.options.returnNull&&null===e||!this.options.returnEmptyString&&""===e)}},{key:"getResource",value:function(e,t,n){var o=arguments.length>3&&void 0!==arguments[3]?arguments[3]:{};return this.i18nFormat&&this.i18nFormat.getResource?this.i18nFormat.getResource(e,t,n,o):this.resourceStore.getResource(e,t,n,o)}}]),n}();function C(e){return e.charAt(0).toUpperCase()+e.slice(1)}var P=function(){function e(t){i(this,e),this.options=t,this.whitelist=this.options.whitelist||!1,this.logger=h.create("languageUtils")}return a(e,[{key:"getScriptPartFromCode",value:function(e){if(!e||e.indexOf("-")<0)return null;var t=e.split("-");return 2===t.length?null:(t.pop(),this.formatLanguageCode(t.join("-")))}},{key:"getLanguagePartFromCode",value:function(e){if(!e||e.indexOf("-")<0)return e;var t=e.split("-");return this.formatLanguageCode(t[0])}},{key:"formatLanguageCode",value:function(e){if("string"==typeof e&&e.indexOf("-")>-1){var t=["hans","hant","latn","cyrl","cans","mong","arab"],n=e.split("-");return this.options.lowerCaseLng?n=n.map(function(e){return e.toLowerCase()}):2===n.length?(n[0]=n[0].toLowerCase(),n[1]=n[1].toUpperCase(),t.indexOf(n[1].toLowerCase())>-1&&(n[1]=C(n[1].toLowerCase()))):3===n.length&&(n[0]=n[0].toLowerCase(),2===n[1].length&&(n[1]=n[1].toUpperCase()),"sgn"!==n[0]&&2===n[2].length&&(n[2]=n[2].toUpperCase()),t.indexOf(n[1].toLowerCase())>-1&&(n[1]=C(n[1].toLowerCase())),t.indexOf(n[2].toLowerCase())>-1&&(n[2]=C(n[2].toLowerCase()))),n.join("-")}return this.options.cleanCode||this.options.lowerCaseLng?e.toLowerCase():e}},{key:"isWhitelisted",value:function(e){return("languageOnly"===this.options.load||this.options.nonExplicitWhitelist)&&(e=this.getLanguagePartFromCode(e)),!this.whitelist||!this.whitelist.length||this.whitelist.indexOf(e)>-1}},{key:"getFallbackCodes",value:function(e,t){if(!e)return[];if("string"==typeof e&&(e=[e]),"[object Array]"===Object.prototype.toString.apply(e))return e;if(!t)return e.default||[];var n=e[t];return n||(n=e[this.getScriptPartFromCode(t)]),n||(n=e[this.formatLanguageCode(t)]),n||(n=e.default),n||[]}},{key:"toResolveHierarchy",value:function(e,t){var n=this,o=this.getFallbackCodes(t||this.options.fallbackLng||[],e),i=[],r=function(e){e&&(n.isWhitelisted(e)?i.push(e):n.logger.warn("rejecting non-whitelisted language code: ".concat(e)))};return"string"==typeof e&&e.indexOf("-")>-1?("languageOnly"!==this.options.load&&r(this.formatLanguageCode(e)),"languageOnly"!==this.options.load&&"currentOnly"!==this.options.load&&r(this.getScriptPartFromCode(e)),"currentOnly"!==this.options.load&&r(this.getLanguagePartFromCode(e))):"string"==typeof e&&r(this.formatLanguageCode(e)),o.forEach(function(e){i.indexOf(e)<0&&r(n.formatLanguageCode(e))}),i}}]),e}(),E=[{lngs:["ach","ak","am","arn","br","fil","gun","ln","mfe","mg","mi","oc","pt","pt-BR","tg","ti","tr","uz","wa"],nr:[1,2],fc:1},{lngs:["af","an","ast","az","bg","bn","ca","da","de","dev","el","en","eo","es","et","eu","fi","fo","fur","fy","gl","gu","ha","hi","hu","hy","ia","it","kn","ku","lb","mai","ml","mn","mr","nah","nap","nb","ne","nl","nn","no","nso","pa","pap","pms","ps","pt-PT","rm","sco","se","si","so","son","sq","sv","sw","ta","te","tk","ur","yo"],nr:[1,2],fc:2},{lngs:["ay","bo","cgg","fa","id","ja","jbo","ka","kk","km","ko","ky","lo","ms","sah","su","th","tt","ug","vi","wo","zh"],nr:[1],fc:3},{lngs:["be","bs","cnr","dz","hr","ru","sr","uk"],nr:[1,2,5],fc:4},{lngs:["ar"],nr:[0,1,2,3,11,100],fc:5},{lngs:["cs","sk"],nr:[1,2,5],fc:6},{lngs:["csb","pl"],nr:[1,2,5],fc:7},{lngs:["cy"],nr:[1,2,3,8],fc:8},{lngs:["fr"],nr:[1,2],fc:9},{lngs:["ga"],nr:[1,2,3,7,11],fc:10},{lngs:["gd"],nr:[1,2,3,20],fc:11},{lngs:["is"],nr:[1,2],fc:12},{lngs:["jv"],nr:[0,1],fc:13},{lngs:["kw"],nr:[1,2,3,4],fc:14},{lngs:["lt"],nr:[1,2,10],fc:15},{lngs:["lv"],nr:[1,2,0],fc:16},{lngs:["mk"],nr:[1,2],fc:17},{lngs:["mnk"],nr:[0,1,2],fc:18},{lngs:["mt"],nr:[1,2,11,20],fc:19},{lngs:["or"],nr:[2,1],fc:2},{lngs:["ro"],nr:[1,2,20],fc:20},{lngs:["sl"],nr:[5,1,2,3],fc:21},{lngs:["he"],nr:[1,2,20,21],fc:22}],F={1:function(e){return Number(e>1)},2:function(e){return Number(1!=e)},3:function(e){return 0},4:function(e){return Number(e%10==1&&e%100!=11?0:e%10>=2&&e%10<=4&&(e%100<10||e%100>=20)?1:2)},5:function(e){return Number(0===e?0:1==e?1:2==e?2:e%100>=3&&e%100<=10?3:e%100>=11?4:5)},6:function(e){return Number(1==e?0:e>=2&&e<=4?1:2)},7:function(e){return Number(1==e?0:e%10>=2&&e%10<=4&&(e%100<10||e%100>=20)?1:2)},8:function(e){return Number(1==e?0:2==e?1:8!=e&&11!=e?2:3)},9:function(e){return Number(e>=2)},10:function(e){return Number(1==e?0:2==e?1:e<7?2:e<11?3:4)},11:function(e){return Number(1==e||11==e?0:2==e||12==e?1:e>2&&e<20?2:3)},12:function(e){return Number(e%10!=1||e%100==11)},13:function(e){return Number(0!==e)},14:function(e){return Number(1==e?0:2==e?1:3==e?2:3)},15:function(e){return Number(e%10==1&&e%100!=11?0:e%10>=2&&(e%100<10||e%100>=20)?1:2)},16:function(e){return Number(e%10==1&&e%100!=11?0:0!==e?1:2)},17:function(e){return Number(1==e||e%10==1?0:1)},18:function(e){return Number(0==e?0:1==e?1:2)},19:function(e){return Number(1==e?0:0===e||e%100>1&&e%100<11?1:e%100>10&&e%100<20?2:3)},20:function(e){return Number(1==e?0:0===e||e%100>0&&e%100<20?1:2)},21:function(e){return Number(e%100==1?1:e%100==2?2:e%100==3||e%100==4?3:0)},22:function(e){return Number(1===e?0:2===e?1:(e<0||e>10)&&e%10==0?2:3)}};var T=function(){function e(t){var n,o=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};i(this,e),this.languageUtils=t,this.options=o,this.logger=h.create("pluralResolver"),this.rules=(n={},E.forEach(function(e){e.lngs.forEach(function(t){n[t]={numbers:e.nr,plurals:F[e.fc]}})}),n)}return a(e,[{key:"addRule",value:function(e,t){this.rules[e]=t}},{key:"getRule",value:function(e){return this.rules[e]||this.rules[this.languageUtils.getLanguagePartFromCode(e)]}},{key:"needsPlural",value:function(e){var t=this.getRule(e);return t&&t.numbers.length>1}},{key:"getPluralFormsOfKey",value:function(e,t){var n=this,o=[],i=this.getRule(e);return i?(i.numbers.forEach(function(i){var r=n.getSuffix(e,i);o.push("".concat(t).concat(r))}),o):o}},{key:"getSuffix",value:function(e,t){var n=this,o=this.getRule(e);if(o){var i=o.noAbs?o.plurals(t):o.plurals(Math.abs(t)),r=o.numbers[i];this.options.simplifyPluralSuffix&&2===o.numbers.length&&1===o.numbers[0]&&(2===r?r="plural":1===r&&(r=""));var a=function(){return n.options.prepend&&r.toString()?n.options.prepend+r.toString():r.toString()};return"v1"===this.options.compatibilityJSON?1===r?"":"number"==typeof r?"_plural_".concat(r.toString()):a():"v2"===this.options.compatibilityJSON?a():this.options.simplifyPluralSuffix&&2===o.numbers.length&&1===o.numbers[0]?a():this.options.prepend&&i.toString()?this.options.prepend+i.toString():i.toString()}return this.logger.warn("no plural rule found for: ".concat(e)),""}}]),e}(),A=function(){function e(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};i(this,e),this.logger=h.create("interpolator"),this.options=t,this.format=t.interpolation&&t.interpolation.format||function(e){return e},this.init(t)}return a(e,[{key:"init",value:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};e.interpolation||(e.interpolation={escapeValue:!0});var t=e.interpolation;this.escape=void 0!==t.escape?t.escape:O,this.escapeValue=void 0===t.escapeValue||t.escapeValue,this.useRawValueToEscape=void 0!==t.useRawValueToEscape&&t.useRawValueToEscape,this.prefix=t.prefix?w(t.prefix):t.prefixEscaped||"{{",this.suffix=t.suffix?w(t.suffix):t.suffixEscaped||"}}",this.formatSeparator=t.formatSeparator?t.formatSeparator:t.formatSeparator||",",this.unescapePrefix=t.unescapeSuffix?"":t.unescapePrefix||"-",this.unescapeSuffix=this.unescapePrefix?"":t.unescapeSuffix||"",this.nestingPrefix=t.nestingPrefix?w(t.nestingPrefix):t.nestingPrefixEscaped||w("$t("),this.nestingSuffix=t.nestingSuffix?w(t.nestingSuffix):t.nestingSuffixEscaped||w(")"),this.maxReplaces=t.maxReplaces?t.maxReplaces:1e3,this.resetRegExp()}},{key:"reset",value:function(){this.options&&this.init(this.options)}},{key:"resetRegExp",value:function(){var e="".concat(this.prefix,"(.+?)").concat(this.suffix);this.regexp=new RegExp(e,"g");var t="".concat(this.prefix).concat(this.unescapePrefix,"(.+?)").concat(this.unescapeSuffix).concat(this.suffix);this.regexpUnescape=new RegExp(t,"g");var n="".concat(this.nestingPrefix,"(.+?)").concat(this.nestingSuffix);this.nestingRegexp=new RegExp(n,"g")}},{key:"interpolate",value:function(e,t,n,o){var i,r,a,s=this,u=this.options&&this.options.interpolation&&this.options.interpolation.defaultVariables||{};function l(e){return e.replace(/\$/g,"$$$$")}var c=function(e){if(e.indexOf(s.formatSeparator)<0)return x(t,u,e);var o=e.split(s.formatSeparator),i=o.shift().trim(),r=o.join(s.formatSeparator).trim();return s.format(x(t,u,i),r,n)};this.resetRegExp();var f=o&&o.missingInterpolationHandler||this.options.missingInterpolationHandler;for(a=0;i=this.regexpUnescape.exec(e);){if(void 0===(r=c(i[1].trim())))if("function"==typeof f){var p=f(e,i,o);r="string"==typeof p?p:""}else this.logger.warn("missed to pass in variable ".concat(i[1]," for interpolating ").concat(e)),r="";else"string"==typeof r||this.useRawValueToEscape||(r=y(r));if(e=e.replace(i[0],l(r)),this.regexpUnescape.lastIndex=0,++a>=this.maxReplaces)break}for(a=0;i=this.regexp.exec(e);){if(void 0===(r=c(i[1].trim())))if("function"==typeof f){var g=f(e,i,o);r="string"==typeof g?g:""}else this.logger.warn("missed to pass in variable ".concat(i[1]," for interpolating ").concat(e)),r="";else"string"==typeof r||this.useRawValueToEscape||(r=y(r));if(r=this.escapeValue?l(this.escape(r)):l(r),e=e.replace(i[0],r),this.regexp.lastIndex=0,++a>=this.maxReplaces)break}return e}},{key:"nest",value:function(e,t){var n,i,r=o({},arguments.length>2&&void 0!==arguments[2]?arguments[2]:{});function a(e,t){if(e.indexOf(",")<0)return e;var n=e.split(",");e=n.shift();var i=n.join(",");i=(i=this.interpolate(i,r)).replace(/'/g,'"');try{r=JSON.parse(i),t&&(r=o({},t,r))}catch(t){this.logger.error("failed parsing options string in nesting for key ".concat(e),t)}return delete r.defaultValue,e}for(r.applyPostProcessor=!1,delete r.defaultValue;n=this.nestingRegexp.exec(e);){if((i=t(a.call(this,n[1].trim(),r),r))&&n[0]===e&&"string"!=typeof i)return i;"string"!=typeof i&&(i=y(i)),i||(this.logger.warn("missed to resolve ".concat(n[1]," for nesting ").concat(e)),i=""),e=e.replace(n[0],i),this.regexp.lastIndex=0}return e}}]),e}();function V(e,t){return function(e){if(Array.isArray(e))return e}(e)||function(e,t){var n=[],o=!0,i=!1,r=void 0;try{for(var a,s=e[Symbol.iterator]();!(o=(a=s.next()).done)&&(n.push(a.value),!t||n.length!==t);o=!0);}catch(e){i=!0,r=e}finally{try{o||null==s.return||s.return()}finally{if(i)throw r}}return n}(e,t)||function(){throw new TypeError("Invalid attempt to destructure non-iterable instance")}()}var U=function(e){function t(e,n,o){var r,a=arguments.length>3&&void 0!==arguments[3]?arguments[3]:{};return i(this,t),r=u(this,l(t).call(this)),d.call(s(r)),r.backend=e,r.store=n,r.services=o,r.languageUtils=o.languageUtils,r.options=a,r.logger=h.create("backendConnector"),r.state={},r.queue=[],r.backend&&r.backend.init&&r.backend.init(o,a.backend,a),r}return f(t,d),a(t,[{key:"queueLoad",value:function(e,t,n,o){var i=this,r=[],a=[],s=[],u=[];return e.forEach(function(e){var o=!0;t.forEach(function(t){var s="".concat(e,"|").concat(t);!n.reload&&i.store.hasResourceBundle(e,t)?i.state[s]=2:i.state[s]<0||(1===i.state[s]?a.indexOf(s)<0&&a.push(s):(i.state[s]=1,o=!1,a.indexOf(s)<0&&a.push(s),r.indexOf(s)<0&&r.push(s),u.indexOf(t)<0&&u.push(t)))}),o||s.push(e)}),(r.length||a.length)&&this.queue.push({pending:a,loaded:{},errors:[],callback:o}),{toLoad:r,pending:a,toLoadLanguages:s,toLoadNamespaces:u}}},{key:"loaded",value:function(e,t,n){var o=V(e.split("|"),2),i=o[0],r=o[1];t&&this.emit("failedLoading",i,r,t),n&&this.store.addResourceBundle(i,r,n),this.state[e]=t?-1:2;var a={};this.queue.forEach(function(n){var o,s,u,l,c,f;o=n.loaded,s=r,l=m(o,[i],Object),c=l.obj,f=l.k,c[f]=c[f]||[],u&&(c[f]=c[f].concat(s)),u||c[f].push(s),function(e,t){for(var n=e.indexOf(t);-1!==n;)e.splice(n,1),n=e.indexOf(t)}(n.pending,e),t&&n.errors.push(t),0!==n.pending.length||n.done||(Object.keys(n.loaded).forEach(function(e){a[e]||(a[e]=[]),n.loaded[e].length&&n.loaded[e].forEach(function(t){a[e].indexOf(t)<0&&a[e].push(t)})}),n.done=!0,n.errors.length?n.callback(n.errors):n.callback())}),this.emit("loaded",a),this.queue=this.queue.filter(function(e){return!e.done})}},{key:"read",value:function(e,t,n){var o=this,i=arguments.length>3&&void 0!==arguments[3]?arguments[3]:0,r=arguments.length>4&&void 0!==arguments[4]?arguments[4]:250,a=arguments.length>5?arguments[5]:void 0;return e.length?this.backend[n](e,t,function(s,u){s&&u&&i<5?setTimeout(function(){o.read.call(o,e,t,n,i+1,2*r,a)},r):a(s,u)}):a(null,{})}},{key:"prepareLoading",value:function(e,t){var n=this,o=arguments.length>2&&void 0!==arguments[2]?arguments[2]:{},i=arguments.length>3?arguments[3]:void 0;if(!this.backend)return this.logger.warn("No backend was added via i18next.use. Will not load resources."),i&&i();"string"==typeof e&&(e=this.languageUtils.toResolveHierarchy(e)),"string"==typeof t&&(t=[t]);var r=this.queueLoad(e,t,o,i);if(!r.toLoad.length)return r.pending.length||i(),null;r.toLoad.forEach(function(e){n.loadOne(e)})}},{key:"load",value:function(e,t,n){this.prepareLoading(e,t,{},n)}},{key:"reload",value:function(e,t,n){this.prepareLoading(e,t,{reload:!0},n)}},{key:"loadOne",value:function(e){var t=this,n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"",o=V(e.split("|"),2),i=o[0],r=o[1];this.read(i,r,"read",void 0,void 0,function(o,a){o&&t.logger.warn("".concat(n,"loading namespace ").concat(r," for language ").concat(i," failed"),o),!o&&a&&t.logger.log("".concat(n,"loaded namespace ").concat(r," for language ").concat(i),a),t.loaded(e,o,a)})}},{key:"saveMissing",value:function(e,t,n,i,r){var a=arguments.length>5&&void 0!==arguments[5]?arguments[5]:{};this.services.utils&&this.services.utils.hasLoadedNamespace&&!this.services.utils.hasLoadedNamespace(t)?this.logger.warn('did not save key "'.concat(n,'" for namespace "').concat(t,'" as the namespace was not yet loaded'),"This means something IS WRONG in your application setup. You access the t function before i18next.init / i18next.loadNamespace / i18next.changeLanguage was done. Wait for the callback or Promise to resolve before accessing it!!!"):null!=n&&""!==n&&(this.backend&&this.backend.create&&this.backend.create(e,t,n,i,null,o({},a,{isUpdate:r})),e&&e[0]&&this.store.addResource(e[0],t,n,i))}}]),t}();function I(e){return"string"==typeof e.ns&&(e.ns=[e.ns]),"string"==typeof e.fallbackLng&&(e.fallbackLng=[e.fallbackLng]),"string"==typeof e.fallbackNS&&(e.fallbackNS=[e.fallbackNS]),e.whitelist&&e.whitelist.indexOf("cimode")<0&&(e.whitelist=e.whitelist.concat(["cimode"])),e}function H(){}return new(function(e){function n(){var e,t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},o=arguments.length>1?arguments[1]:void 0;if(i(this,n),e=u(this,l(n).call(this)),d.call(s(e)),e.options=I(t),e.services={},e.logger=h,e.modules={external:[]},o&&!e.isInitialized&&!t.isClone){if(!e.options.initImmediate)return e.init(t,o),u(e,s(e));setTimeout(function(){e.init(t,o)},0)}return e}return f(n,d),a(n,[{key:"init",value:function(){var e=this,n=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},i=arguments.length>1?arguments[1]:void 0;function r(e){return e?"function"==typeof e?new e:e:null}if("function"==typeof n&&(i=n,n={}),this.options=o({},{debug:!1,initImmediate:!0,ns:["translation"],defaultNS:["translation"],fallbackLng:["dev"],fallbackNS:!1,whitelist:!1,nonExplicitWhitelist:!1,load:"all",preload:!1,simplifyPluralSuffix:!0,keySeparator:".",nsSeparator:":",pluralSeparator:"_",contextSeparator:"_",partialBundledLanguages:!1,saveMissing:!1,updateMissing:!1,saveMissingTo:"fallback",saveMissingPlurals:!0,missingKeyHandler:!1,missingInterpolationHandler:!1,postProcess:!1,postProcessPassResolved:!1,returnNull:!0,returnEmptyString:!0,returnObjects:!1,joinArrays:!1,returnedObjectHandler:!1,parseMissingKeyHandler:!1,appendNamespaceToMissingKey:!1,appendNamespaceToCIMode:!1,overloadTranslationOptionHandler:function(e){var n={};if("object"===t(e[1])&&(n=e[1]),"string"==typeof e[1]&&(n.defaultValue=e[1]),"string"==typeof e[2]&&(n.tDescription=e[2]),"object"===t(e[2])||"object"===t(e[3])){var o=e[3]||e[2];Object.keys(o).forEach(function(e){n[e]=o[e]})}return n},interpolation:{escapeValue:!0,format:function(e,t,n){return e},prefix:"{{",suffix:"}}",formatSeparator:",",unescapePrefix:"-",nestingPrefix:"$t(",nestingSuffix:")",maxReplaces:1e3}},this.options,I(n)),this.format=this.options.interpolation.format,i||(i=H),!this.options.isClone){this.modules.logger?h.init(r(this.modules.logger),this.options):h.init(null,this.options);var a=new P(this.options);this.store=new L(this.options.resources,this.options);var s=this.services;s.logger=h,s.resourceStore=this.store,s.languageUtils=a,s.pluralResolver=new T(a,{prepend:this.options.pluralSeparator,compatibilityJSON:this.options.compatibilityJSON,simplifyPluralSuffix:this.options.simplifyPluralSuffix}),s.interpolator=new A(this.options),s.utils={hasLoadedNamespace:this.hasLoadedNamespace.bind(this)},s.backendConnector=new U(r(this.modules.backend),s.resourceStore,s,this.options),s.backendConnector.on("*",function(t){for(var n=arguments.length,o=new Array(n>1?n-1:0),i=1;i<n;i++)o[i-1]=arguments[i];e.emit.apply(e,[t].concat(o))}),this.modules.languageDetector&&(s.languageDetector=r(this.modules.languageDetector),s.languageDetector.init(s,this.options.detection,this.options)),this.modules.i18nFormat&&(s.i18nFormat=r(this.modules.i18nFormat),s.i18nFormat.init&&s.i18nFormat.init(this)),this.translator=new j(this.services,this.options),this.translator.on("*",function(t){for(var n=arguments.length,o=new Array(n>1?n-1:0),i=1;i<n;i++)o[i-1]=arguments[i];e.emit.apply(e,[t].concat(o))}),this.modules.external.forEach(function(t){t.init&&t.init(e)})}["getResource","addResource","addResources","addResourceBundle","removeResourceBundle","hasResourceBundle","getResourceBundle","getDataByLanguage"].forEach(function(t){e[t]=function(){var n;return(n=e.store)[t].apply(n,arguments)}});var u=v(),l=function(){e.changeLanguage(e.options.lng,function(t,n){e.isInitialized=!0,e.logger.log("initialized",e.options),e.emit("initialized",e.options),u.resolve(n),i(t,n)})};return this.options.resources||!this.options.initImmediate?l():setTimeout(l,0),u}},{key:"loadResources",value:function(e){var t=this,n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:H,o="string"==typeof e?e:this.language;if("function"==typeof e&&(n=e),!this.options.resources||this.options.partialBundledLanguages){if(o&&"cimode"===o.toLowerCase())return n();var i=[],r=function(e){e&&t.services.languageUtils.toResolveHierarchy(e).forEach(function(e){i.indexOf(e)<0&&i.push(e)})};if(o)r(o);else this.services.languageUtils.getFallbackCodes(this.options.fallbackLng).forEach(function(e){return r(e)});this.options.preload&&this.options.preload.forEach(function(e){return r(e)}),this.services.backendConnector.load(i,this.options.ns,n)}else n(null)}},{key:"reloadResources",value:function(e,t,n){var o=v();return e||(e=this.languages),t||(t=this.options.ns),n||(n=H),this.services.backendConnector.reload(e,t,function(e){o.resolve(),n(e)}),o}},{key:"use",value:function(e){return"backend"===e.type&&(this.modules.backend=e),("logger"===e.type||e.log&&e.warn&&e.error)&&(this.modules.logger=e),"languageDetector"===e.type&&(this.modules.languageDetector=e),"i18nFormat"===e.type&&(this.modules.i18nFormat=e),"postProcessor"===e.type&&R.addPostProcessor(e),"3rdParty"===e.type&&this.modules.external.push(e),this}},{key:"changeLanguage",value:function(e,t){var n=this;this.isLanguageChangingTo=e;var o=v();this.emit("languageChanging",e);var i=function(e){e&&(n.language||(n.language=e,n.languages=n.services.languageUtils.toResolveHierarchy(e)),n.translator.language||n.translator.changeLanguage(e),n.services.languageDetector&&n.services.languageDetector.cacheUserLanguage(e)),n.loadResources(e,function(i){!function(e,i){i?(n.language=i,n.languages=n.services.languageUtils.toResolveHierarchy(i),n.translator.changeLanguage(i),n.isLanguageChangingTo=void 0,n.emit("languageChanged",i),n.logger.log("languageChanged",i)):n.isLanguageChangingTo=void 0,o.resolve(function(){return n.t.apply(n,arguments)}),t&&t(e,function(){return n.t.apply(n,arguments)})}(i,e)})};return e||!this.services.languageDetector||this.services.languageDetector.async?!e&&this.services.languageDetector&&this.services.languageDetector.async?this.services.languageDetector.detect(i):i(e):i(this.services.languageDetector.detect()),o}},{key:"getFixedT",value:function(e,n){var i=this,r=function e(n,r){var a;if("object"!==t(r)){for(var s=arguments.length,u=new Array(s>2?s-2:0),l=2;l<s;l++)u[l-2]=arguments[l];a=i.options.overloadTranslationOptionHandler([n,r].concat(u))}else a=o({},r);return a.lng=a.lng||e.lng,a.lngs=a.lngs||e.lngs,a.ns=a.ns||e.ns,i.t(n,a)};return"string"==typeof e?r.lng=e:r.lngs=e,r.ns=n,r}},{key:"t",value:function(){var e;return this.translator&&(e=this.translator).translate.apply(e,arguments)}},{key:"exists",value:function(){var e;return this.translator&&(e=this.translator).exists.apply(e,arguments)}},{key:"setDefaultNamespace",value:function(e){this.options.defaultNS=e}},{key:"hasLoadedNamespace",value:function(e){var t=this;if(!this.isInitialized)return this.logger.warn("hasLoadedNamespace: i18next was not initialized",this.languages),!1;if(!this.languages||!this.languages.length)return this.logger.warn("hasLoadedNamespace: i18n.languages were undefined or empty",this.languages),!1;var n=this.languages[0],o=!!this.options&&this.options.fallbackLng,i=this.languages[this.languages.length-1];if("cimode"===n.toLowerCase())return!0;var r=function(e,n){var o=t.services.backendConnector.state["".concat(e,"|").concat(n)];return-1===o||2===o};return!!this.hasResourceBundle(n,e)||(!this.services.backendConnector.backend||!(!r(n,e)||o&&!r(i,e)))}},{key:"loadNamespaces",value:function(e,t){var n=this,o=v();return this.options.ns?("string"==typeof e&&(e=[e]),e.forEach(function(e){n.options.ns.indexOf(e)<0&&n.options.ns.push(e)}),this.loadResources(function(e){o.resolve(),t&&t(e)}),o):(t&&t(),Promise.resolve())}},{key:"loadLanguages",value:function(e,t){var n=v();"string"==typeof e&&(e=[e]);var o=this.options.preload||[],i=e.filter(function(e){return o.indexOf(e)<0});return i.length?(this.options.preload=o.concat(i),this.loadResources(function(e){n.resolve(),t&&t(e)}),n):(t&&t(),Promise.resolve())}},{key:"dir",value:function(e){if(e||(e=this.languages&&this.languages.length>0?this.languages[0]:this.language),!e)return"rtl";return["ar","shu","sqr","ssh","xaa","yhd","yud","aao","abh","abv","acm","acq","acw","acx","acy","adf","ads","aeb","aec","afb","ajp","apc","apd","arb","arq","ars","ary","arz","auz","avl","ayh","ayl","ayn","ayp","bbz","pga","he","iw","ps","pbt","pbu","pst","prp","prd","ur","ydd","yds","yih","ji","yi","hbo","men","xmn","fa","jpr","peo","pes","prs","dv","sam"].indexOf(this.services.languageUtils.getLanguagePartFromCode(e))>=0?"rtl":"ltr"}},{key:"createInstance",value:function(){return new n(arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},arguments.length>1?arguments[1]:void 0)}},{key:"cloneInstance",value:function(){var e=this,t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{},i=arguments.length>1&&void 0!==arguments[1]?arguments[1]:H,r=o({},this.options,t,{isClone:!0}),a=new n(r);return["store","services","language"].forEach(function(t){a[t]=e[t]}),a.translator=new j(a.services,a.options),a.translator.on("*",function(e){for(var t=arguments.length,n=new Array(t>1?t-1:0),o=1;o<t;o++)n[o-1]=arguments[o];a.emit.apply(a,[e].concat(n))}),a.init(r,i),a.translator.options=a.options,a}}]),n}())});
