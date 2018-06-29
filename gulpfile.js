var gulp=require('gulp')
var path=require('path')
// 以下为css处理
var sass=require('gulp-sass')
var autoprefixer = require('gulp-autoprefixer');
//以下处理js
var babel=require('gulp-babel')

var server =require('gulp-devserver')
gulp.task('dayin',function(){
  console.log('我打印了')
})
gulp.task('sassToCss',function(){
  // return gulp.src('app/css/**/*.scss')//这里不能这样子写，因为./表示当前文件夹，会有一个缓存机制，造成已有的scss文件坚挺到，新建的文件监听不到   
  return gulp.src(path.resolve(__dirname,'app/css','**','*.scss'))
  .pipe(sass())
  .pipe(autoprefixer({browsers: ['last 2 versions']}))
  .pipe(gulp.dest(path.resolve(__dirname,'app','css')))
})
gulp.task('watchcss',function(){
  gulp.watch(path.resolve(__dirname,'app/css/**/*.scss'),['sassToCss'])
})
gulp.task('babel',function(){
  gulp.src(path.resolve(__dirname,'./app/jses6/**/*.js'))
  .pipe(babel())
  .pipe(gulp.dest(path.resolve(__dirname,'app/js')))  
})
gulp.task('watchjs',function(){
  gulp.watch(path.resolve(__dirname,'app/jses6/**/*.js'),['babel'])
})

// gulp.task('default',['watchjs','watchcss'])



// gulp.task('default', function() {
//   // 将你的默认的任务代码放在这
//   console.log('lll')
// });
// gulp.task('devserver',function(){
//   gulp.src('./app')
//   .pipe(server({
//     livereload: {
//       clientConsole: true,
//       enable:false,//监听文件变化自动重新加载default: true
//       filter: function(filename) {
//         return !/\/\.svn\/|\/\.git\/|\/node_modules\//.test(filename);
//       }
//     },
//     port:1234,
//     listdir:true,//是否显示文件夹下文件
//     open:false,
//     proxy: {
//       enable: true,
//       host: 'http://w3cboy.com',
//       urls: /^\/api\//
//     }
//    }));
// })





