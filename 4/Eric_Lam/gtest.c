#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <fcntl.h>

int main() {
  int fd, r, g, b, i, j;
  char line[256];

  umask(0);

  fd = open("pic.ppm", O_CREAT | O_TRUNC | O_WRONLY, 0644);
  sprintf(line,"P3\n510 510 255\n");
  write(fd,line,strlen(line));

  for(i = 0; i < 510; i++)
    for(j = 0; j < 510; j++) {
      r = j / 2 % 255;
      g = i / 2 % 255;
      b = (i * j / 2) % 255;
      sprintf(line,"%d %d %d ",r,g,b);
      write(fd,line,strlen(line));
    }
}
